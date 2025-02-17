package tech.jhipster.lite.module.domain.replacement;

import tech.jhipster.lite.shared.error.domain.ReplacementException;

class UnknownCurrentValueException extends ReplacementException {

  public UnknownCurrentValueException(String currentValue, String content) {
    super(badRequest(ReplacementErrorKey.UNKNOWN_CURRENT_VALUE).message(buildMessage(currentValue, content)));
  }

  private static String buildMessage(String currentValue, String content) {
    return "Can't find \"%s\" in %s".formatted(currentValue, content);
  }
}
