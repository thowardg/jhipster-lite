package tech.jhipster.lite.module.infrastructure.secondary.javadependency;

import tech.jhipster.lite.module.domain.properties.JHipsterProjectFolder;
import tech.jhipster.lite.shared.error.domain.JavaException;

class MissingJavaBuildConfigurationException extends JavaException {

  public MissingJavaBuildConfigurationException(JHipsterProjectFolder folder) {
    super(
      badRequest(JavaDependencyErrorKey.MISSING_BUILD_CONFIGURATION).message(buildMessage(folder)).addParameter("folder", folder.get())
    );
  }

  private static String buildMessage(JHipsterProjectFolder folder) {
    return "Can't find any java build tool configuration in %s".formatted(folder.get());
  }
}
