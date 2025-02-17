package tech.jhipster.lite.project.domain;

import tech.jhipster.lite.shared.error.domain.ProjectException;

public class UnknownProjectException extends ProjectException {

  public UnknownProjectException() {
    super(badRequest(ProjectErrorKey.UNKNOWN_PROJECT).message("A user tried to download an unknown project"));
  }
}
