package tech.jhipster.lite.module.infrastructure.secondary.git;

import tech.jhipster.lite.shared.error.domain.GitException;

class GitInitException extends GitException {

  public GitInitException(String message, Throwable cause) {
    super(internalServerError(GitErrorKey.INIT_ERROR).message(message).cause(cause));
  }
}
