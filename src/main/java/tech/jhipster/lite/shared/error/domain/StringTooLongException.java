package tech.jhipster.lite.shared.error.domain;

import java.util.Map;

public final class StringTooLongException extends StringException {

  private final String maxLength;
  private final String currentLength;

  private StringTooLongException(StringTooLongExceptionBuilder builder) {
    super(builder.field, builder.message());
    this.maxLength = String.valueOf(builder.maxLength);
    this.currentLength = String.valueOf(builder.value.length());
  }

  public static StringTooLongExceptionBuilder builder() {
    return new StringTooLongExceptionBuilder();
  }

  public static final class StringTooLongExceptionBuilder {

    private String value;
    private int maxLength;
    private String field;

    private StringTooLongExceptionBuilder() {}

    public StringTooLongExceptionBuilder field(String field) {
      this.field = field;
      return this;
    }

    public StringTooLongExceptionBuilder value(String value) {
      this.value = value;
      return this;
    }

    public StringTooLongExceptionBuilder maxLength(int maxLength) {
      this.maxLength = maxLength;
      return this;
    }

    private String message() {
      return "The value in field \"" + field + "\" must be at most " + maxLength + " long but was " + value.length();
    }

    public StringTooLongException build() {
      return new StringTooLongException(this);
    }
  }

  @Override
  public AssertionErrorType type() {
    return AssertionErrorType.STRING_TOO_LONG;
  }

  @Override
  public Map<String, String> parameters() {
    return Map.of("maxLength", maxLength, "currentLength", currentLength);
  }
}
