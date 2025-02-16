package tech.jhipster.lite.module.domain.replacement;

import java.util.function.BiFunction;

public interface FileReplacerAbstract extends ElementReplacer {
  @Override
  public abstract BiFunction<String, String, String> replacement();

  @Override
  public abstract String searchMatcher();
}
