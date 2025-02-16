package tech.jhipster.lite.shared.error.domain;

import java.time.Instant;

public final class NotBeforeTimeException extends TimeException {

  private NotBeforeTimeException(String field, Instant value, String hint, Instant other) {
    super(field, value, hint, other);
  }

  public static NotBeforeTimeExceptionBuilder field(String fieldName, Instant value) {
    return new NotBeforeTimeExceptionBuilder(fieldName, value);
  }

  public static class NotBeforeTimeExceptionBuilder {

    private final String fieldName;
    private final Instant value;

    public NotBeforeTimeExceptionBuilder(String fieldName, Instant value) {
      this.fieldName = fieldName;
      this.value = value;
    }

    public NotBeforeTimeException strictlyNotBefore(Instant other) {
      return new NotBeforeTimeException(fieldName, value, "must be strictly before", other);
    }

    public NotBeforeTimeException notBefore(Instant other) {
      return new NotBeforeTimeException(fieldName, value, "must be before", other);
    }
  }

  @Override
  public AssertionErrorType type() {
    return AssertionErrorType.NOT_BEFORE_TIME;
  }
}
