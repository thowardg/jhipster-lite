package tech.jhipster.lite.shared.error.domain;

import java.time.Instant;

public final class NotAfterTimeException extends TimeException {

  private NotAfterTimeException(String field, Instant value, String hint, Instant other) {
    super(field, value, hint, other);
  }

  public static NotAfterTimeExceptionBuilder field(String fieldName, Instant value) {
    return new NotAfterTimeExceptionBuilder(fieldName, value);
  }

  public static class NotAfterTimeExceptionBuilder {

    private final String fieldName;
    private final Instant value;

    public NotAfterTimeExceptionBuilder(String fieldName, Instant value) {
      this.fieldName = fieldName;
      this.value = value;
    }

    public NotAfterTimeException strictlyNotAfter(Instant other) {
      return new NotAfterTimeException(fieldName, value, "must be strictly after", other);
    }

    public NotAfterTimeException notAfter(Instant other) {
      return new NotAfterTimeException(fieldName, value, "must be after", other);
    }
  }

  @Override
  public AssertionErrorType type() {
    return AssertionErrorType.NOT_AFTER_TIME;
  }
}
