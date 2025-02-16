package tech.jhipster.lite.shared.error.domain;

public abstract class StringException extends AssertionException {

  protected StringException(String field, String message) {
    super(field, message);
  }
}
