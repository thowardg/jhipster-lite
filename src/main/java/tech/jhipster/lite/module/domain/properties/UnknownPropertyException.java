package tech.jhipster.lite.module.domain.properties;

import tech.jhipster.lite.shared.error.domain.PropertyException;

class UnknownPropertyException extends PropertyException {

  public UnknownPropertyException(String key) {
    super(badRequest(PropertiesErrorKey.UNKNOWN_PROPERTY).message("Unknown property " + key).addParameter("key", key));
  }
}
