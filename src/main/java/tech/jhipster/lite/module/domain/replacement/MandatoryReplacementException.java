package tech.jhipster.lite.module.domain.replacement;

import tech.jhipster.lite.shared.error.domain.PropertyException;

public class MandatoryReplacementException extends PropertyException {

  public MandatoryReplacementException(Throwable cause) {
    super(
      internalServerError(ReplacementErrorKey.MANDATORY_REPLACEMENT_ERROR).message("Error applying mandatory replacement").cause(cause)
    );
  }
}
