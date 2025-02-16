package tech.jhipster.lite.module.domain.replacement;

import java.util.function.BiFunction;

public interface TextReplacerAbstract extends ElementReplacer {
  @Override
  boolean notMatchIn(String content);

  @Override
  BiFunction<String, String, String> replacement();

  @Override
  String searchMatcher();
}
