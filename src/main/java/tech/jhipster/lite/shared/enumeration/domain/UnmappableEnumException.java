package tech.jhipster.lite.shared.enumeration.domain;

import tech.jhipster.lite.shared.error.domain.ReplacementException;

class UnmappableEnumException extends ReplacementException {

  public <T extends Enum<T>, U extends Enum<U>> UnmappableEnumException(Class<T> from, Class<U> to) {
    super(internalServerError(EnumsErrorKey.UNMAPPABLE_ENUM).message("Can't map " + from + " to " + to));
  }
}
