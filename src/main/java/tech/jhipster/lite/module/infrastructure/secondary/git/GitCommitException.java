package tech.jhipster.lite.module.infrastructure.secondary.git;

import tech.jhipster.lite.shared.error.domain.GitException;

class GitCommitException extends GitException {

  public GitCommitException(String message, Throwable cause) {
    super(internalServerError(GitErrorKey.COMMIT_ERROR).message(message).cause(cause));
  }

  public GitCommitException(String message) {
    super(internalServerError(GitErrorKey.COMMIT_ERROR).message(message));
  }
}
