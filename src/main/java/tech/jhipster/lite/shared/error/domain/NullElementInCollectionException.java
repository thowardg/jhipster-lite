package tech.jhipster.lite.shared.error.domain;

public class NullElementInCollectionException extends ElementException {

  public NullElementInCollectionException(String field) {
    super(field, message(field));
  }

  private static String message(String field) {
    return "The field \"%s\" contains a null element".formatted(field);
  }

  @Override
  public AssertionErrorType type() {
    return AssertionErrorType.NULL_ELEMENT_IN_COLLECTION;
  }
}
