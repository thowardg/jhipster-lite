package tech.jhipster.lite.shared.error.domain;

import java.util.Map;

public final class StringTooShortException extends StringException {

  private final String minLength;
  private final String currentLength;

  private StringTooShortException(StringTooShortExceptionBuilder builder) {
    super(builder.field, builder.message());
    this.minLength = String.valueOf(builder.minLength);
    this.currentLength = String.valueOf(builder.value.length());
  }

  public static StringTooShortExceptionBuilder builder() {
    return new StringTooShortExceptionBuilder();
  }

  public static final class StringTooShortExceptionBuilder {

    private String value;
    private int minLength;
    private String field;

    private StringTooShortExceptionBuilder() {}

    public StringTooShortExceptionBuilder field(String field) {
      this.field = field;
      return this;
    }

    public StringTooShortExceptionBuilder value(String value) {
      this.value = value;
      return this;
    }

    public StringTooShortExceptionBuilder minLength(int minLength) {
      this.minLength = minLength;
      return this;
    }

    private String message() {
      return "The value in field \"" + field + "\" must be at least " + minLength + " long but was only " + value.length();
    }

    public StringTooShortException build() {
      return new StringTooShortException(this);
    }
  }

  @Override
  public AssertionErrorType type() {
    return AssertionErrorType.STRING_TOO_SHORT;
  }

  @Override
  public Map<String, String> parameters() {
    return Map.of("minLength", minLength, "currentLength", currentLength);
  }
}
