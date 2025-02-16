package tech.jhipster.lite.module.domain.replacement;

import java.util.function.BiFunction;

public interface RegexPrePostAbstract extends ElementReplacer {
  boolean notMatchIn(String content);

  BiFunction<String, String, String> replacement();

  String searchMatcher();
}
