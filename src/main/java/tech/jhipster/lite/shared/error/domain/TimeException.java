package tech.jhipster.lite.shared.error.domain;

import java.time.Instant;

public abstract class TimeException extends AssertionException {

  private final Instant value;
  private final String hint;
  private final Instant other;

  protected TimeException(String field, Instant value, String hint, Instant other) {
    super(field, buildMessage(field, value, hint, other));
    this.value = value;
    this.hint = hint;
    this.other = other;
  }

  private static String buildMessage(String fieldName, Instant actual, String hint, Instant other) {
    return new StringBuilder()
      .append("Time in \"")
      .append(fieldName)
      .append("\" having value: ")
      .append(actual)
      .append(' ')
      .append(hint)
      .append(" ")
      .append(other)
      .append(" but wasn't")
      .toString();
  }

  public Instant value() {
    return value;
  }

  public String hint() {
    return hint;
  }

  public Instant other() {
    return other;
  }
}
