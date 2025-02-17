package tech.jhipster.lite.module.infrastructure.secondary.npm;

import tech.jhipster.lite.shared.error.domain.DockerNPMException;
import tech.jhipster.lite.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

@ExcludeFromGeneratedCodeCoverage
class NpmInstallException extends DockerNPMException {

  public NpmInstallException(String message) {
    super(internalServerError(NpmErrorKey.INSTALL_ERROR).message(message));
  }

  public NpmInstallException(String message, Throwable cause) {
    super(internalServerError(NpmErrorKey.INSTALL_ERROR).message(message).cause(cause));
  }
}
