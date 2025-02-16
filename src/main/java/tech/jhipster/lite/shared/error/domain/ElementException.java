package tech.jhipster.lite.shared.error.domain;

public abstract class ElementException extends AssertionException {

  protected ElementException(String field, String message) {
    super(field, message);
  }
}
