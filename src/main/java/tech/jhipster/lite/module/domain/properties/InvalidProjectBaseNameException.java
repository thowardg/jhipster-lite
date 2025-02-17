package tech.jhipster.lite.module.domain.properties;

import tech.jhipster.lite.shared.error.domain.PropertyException;

class InvalidProjectBaseNameException extends PropertyException {

  public InvalidProjectBaseNameException() {
    super(
      badRequest(PropertiesErrorKey.INVALID_BASE_NAME).message(
        "Project names can't have special characters, only letters (no accents) and numbers allowed"
      )
    );
  }
}
