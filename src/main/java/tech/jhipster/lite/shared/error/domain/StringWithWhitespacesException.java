package tech.jhipster.lite.shared.error.domain;

public final class StringWithWhitespacesException extends StringException {

  public StringWithWhitespacesException(String field) {
    super(field, message(field));
  }

  private static String message(String field) {
    return "The field \"" + field + "\" contains at least one space";
  }

  @Override
  public AssertionErrorType type() {
    return AssertionErrorType.STRING_WITH_WHITESPACES;
  }
}
