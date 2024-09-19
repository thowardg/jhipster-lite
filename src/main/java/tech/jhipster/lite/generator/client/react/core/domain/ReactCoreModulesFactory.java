package tech.jhipster.lite.generator.client.react.core.domain;

import static tech.jhipster.lite.module.domain.JHipsterModule.*;
import static tech.jhipster.lite.module.domain.npm.JHLiteNpmVersionSource.COMMON;
import static tech.jhipster.lite.module.domain.npm.JHLiteNpmVersionSource.REACT;
import static tech.jhipster.lite.module.domain.packagejson.NodeModuleFormat.MODULE;

import java.util.function.Consumer;
import tech.jhipster.lite.module.domain.Indentation;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.file.JHipsterDestination;
import tech.jhipster.lite.module.domain.file.JHipsterSource;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;
import tech.jhipster.lite.module.domain.replacement.MandatoryReplacer;

public class ReactCoreModulesFactory {

  private static final JHipsterSource SOURCE = from("client/react/core");

  private static final JHipsterSource WEBAPP_SOURCE = SOURCE.append("src/main/webapp");
  private static final JHipsterDestination WEBAPP_DESTINATION = to("src/main/webapp");

  private static final JHipsterSource APP_SOURCE = WEBAPP_SOURCE.append("app");
  private static final JHipsterDestination APP_DESTINATION = WEBAPP_DESTINATION.append("app");

  private static final String PRIMARY_APP = "common/primary/app";
  private static final String ASSETS = "assets";

  private static final JHipsterSource PRIMARY_APP_SOURCE = APP_SOURCE.append(PRIMARY_APP);
  private static final JHipsterDestination PRIMARY_APP_DESTINATION = APP_DESTINATION.append(PRIMARY_APP);

  private static final String TEST_PRIMARY = "src/test/webapp/unit/common/primary/app";
  private static final String DEFAULT_TSCONFIG_PATH = "\"@/*\": [\"src/main/webapp/app/*\"]";

  public JHipsterModule buildModule(JHipsterModuleProperties properties) {
    //@formatter:off
    return moduleBuilder(properties)
      .preCommitActions(stagedFilesFilter("{src/**/,}*.{ts,tsx}"), preCommitCommands("eslint --fix", "prettier --write"))
      .packageJson()
        .type(MODULE)
        .addDevDependency(packageName("@testing-library/dom"), REACT)
        .addDevDependency(packageName("@testing-library/react"), REACT)
        .addDevDependency(packageName("@types/node"), COMMON)
        .addDevDependency(packageName("@types/react"), REACT)
        .addDevDependency(packageName("@types/react-dom"), REACT)
        .addDevDependency(packageName("@tsconfig/vite-react"), REACT)
        .addDevDependency(packageName("@typescript-eslint/eslint-plugin"), COMMON)
        .addDevDependency(packageName("@vitejs/plugin-react"), REACT)
        .addDevDependency(packageName("@vitest/coverage-istanbul"), COMMON)
        .addDevDependency(packageName("typescript-eslint"), COMMON)
        .addDevDependency(packageName("globals"), COMMON)
        .addDevDependency(packageName("eslint"), COMMON)
        .addDevDependency(packageName("eslint-plugin-react"), REACT)
        .addDevDependency(packageName("jsdom"), COMMON)
        .addDevDependency(packageName("typescript"), COMMON)
        .addDevDependency(packageName("ts-node"), REACT)
        .addDevDependency(packageName("vite"), COMMON)
        .addDevDependency(packageName("vite-tsconfig-paths"), COMMON)
        .addDevDependency(packageName("vitest"), COMMON)
        .addDevDependency(packageName("vitest-sonar-reporter"), COMMON)
        .addDependency(packageName("react"), REACT)
        .addDependency(packageName("react-dom"), REACT)
        .addDevDependency(packageName("npm-run-all2"), COMMON)
        .addScript(scriptKey("dev"), scriptCommand("npm-run-all dev:*"))
        .addScript(scriptKey("dev:vite"), scriptCommand("vite"))
        .addScript(scriptKey("build"), scriptCommand("npm-run-all build:*"))
        .addScript(scriptKey("build:tsc"), scriptCommand("tsc"))
        .addScript(scriptKey("build:vite"), scriptCommand("vite build --emptyOutDir"))
        .addScript(scriptKey("preview"), scriptCommand("vite preview"))
        .addScript(scriptKey("start"), scriptCommand("vite"))
        .addScript(scriptKey("lint"), scriptCommand("eslint ."))
        .addScript(scriptKey("watch"), scriptCommand("npm-run-all --parallel watch:*"))
        .addScript(scriptKey("watch:tsc"), scriptCommand("tsc --noEmit --watch"))
        .addScript(scriptKey("test"), scriptCommand("npm run watch:test"))
        .addScript(scriptKey("test:coverage"), scriptCommand("vitest run --coverage"))
        .addScript(scriptKey("watch:test"), scriptCommand("vitest --"))
      .and()
      .files()
        .batch(SOURCE, to("."))
          .addTemplate("vite.config.ts")
          .addTemplate("eslint.config.js")
          .and()
        .batch(APP_SOURCE, APP_DESTINATION)
          .addTemplate("index.css")
          .addTemplate("index.tsx")
          .addTemplate("vite-env.d.ts")
          .and()
        .add(WEBAPP_SOURCE.template("index.html"), WEBAPP_DESTINATION.append("index.html"))
        .add(SOURCE.append(TEST_PRIMARY).template("App.spec.tsx"), to(TEST_PRIMARY).append("App.spec.tsx"))
        .add(PRIMARY_APP_SOURCE.template("App.tsx"), PRIMARY_APP_DESTINATION.append("App.tsx"))
        .add(PRIMARY_APP_SOURCE.template("App.css"), PRIMARY_APP_DESTINATION.append("App.css"))
        .batch(WEBAPP_SOURCE.append(ASSETS), WEBAPP_DESTINATION.append(ASSETS))
          .addFile("JHipster-Lite-neon-blue.png")
          .addFile("ReactLogo.png")
          .and()
        .and()
      .apply(patchTsConfig(properties))
      .apply(patchVitestConfig(properties))
      .build();
    //@formatter:on
  }

  private Consumer<JHipsterModuleBuilder> patchTsConfig(JHipsterModuleProperties properties) {
    String pathsReplacement =
      DEFAULT_TSCONFIG_PATH + "," + LINE_BREAK + properties.indentation().times(3) + "\"@assets/*\": [\"src/main/webapp/assets/*\"]";
    //@formatter:off
    return moduleBuilder -> moduleBuilder
      .mandatoryReplacements()
        .in(path("tsconfig.json"))
          .add(text("@tsconfig/recommended/tsconfig.json"), "@tsconfig/vite-react/tsconfig.json")
          .add(tsConfigCompilerOption("composite", false, properties.indentation()))
          .add(tsConfigCompilerOption("forceConsistentCasingInFileNames", true, properties.indentation()))
          .add(tsConfigCompilerOption("allowSyntheticDefaultImports", true, properties.indentation()))
          .add(text(DEFAULT_TSCONFIG_PATH), pathsReplacement)
          .and()
      .and();
    //@formatter:on
  }

  private static MandatoryReplacer tsConfigCompilerOption(String optionName, boolean optionValue, Indentation indentation) {
    String compilerOption = indentation.times(2) + "\"%s\": %s,".formatted(optionName, optionValue);
    return new MandatoryReplacer(lineAfterRegex("\"compilerOptions\":"), compilerOption);
  }

  private Consumer<JHipsterModuleBuilder> patchVitestConfig(JHipsterModuleProperties properties) {
    //@formatter:off
    return moduleBuilder -> moduleBuilder
      .mandatoryReplacements()
        .in(path("vitest.config.ts"))
          .add(lineAfterRegex("from 'vitest/config';"), "import react from '@vitejs/plugin-react';")
          .add(text( "plugins: ["), "plugins: [react(), ")
          .add(text("environment: 'node',"), "environment: 'jsdom',")
          .add(vitestCoverageExclusion(properties,"src/main/webapp/app/index.tsx"))
          .and();
    //@formatter:on
  }

  private static MandatoryReplacer vitestCoverageExclusion(JHipsterModuleProperties properties, String filePattern) {
    Indentation indentation = properties.indentation();
    return new MandatoryReplacer(lineAfterRegex("configDefaults.coverage.exclude"), indentation.times(4) + "'" + filePattern + "',");
  }
}
