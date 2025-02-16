package tech.jhipster.lite.shared.error.domain;

import java.util.Map;

public abstract class ValueException extends AssertionException {

  private final String field;

  protected ValueException(String field, String message) {
    super(message, message);
    this.field = field;
  }

  public String field() {
    return field;
  }

  public abstract AssertionErrorType type();

  public Map<String, String> parameters() {
    return Map.of();
  }
}
