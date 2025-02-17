package tech.jhipster.lite.project.infrastructure.secondary;

import tech.jhipster.lite.shared.error.domain.ProjectException;

class ProjectZippingException extends ProjectException {

  public ProjectZippingException(String message) {
    super(internalServerError(ProjectErrorKey.ZIPPING_ERROR).message(message));
  }

  public ProjectZippingException(Throwable cause) {
    super(internalServerError(ProjectErrorKey.ZIPPING_ERROR).message("Error creating zip file").cause(cause));
  }
}
