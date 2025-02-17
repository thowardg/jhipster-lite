package tech.jhipster.lite.project.infrastructure.secondary;

import tech.jhipster.lite.shared.error.domain.ProjectException;
import tech.jhipster.lite.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

@ExcludeFromGeneratedCodeCoverage
class ProjectFormattingException extends ProjectException {

  public ProjectFormattingException(String message) {
    super(internalServerError(ProjectErrorKey.FORMATTING_ERROR).message(message));
  }

  public ProjectFormattingException(String message, Throwable cause) {
    super(internalServerError(ProjectErrorKey.FORMATTING_ERROR).message(message).cause(cause));
  }
}
