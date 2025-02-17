package tech.jhipster.lite.module.infrastructure.secondary;

import tech.jhipster.lite.shared.error.domain.GitException;

class UnknownFileToMoveException extends GitException {

  public UnknownFileToMoveException(String filename) {
    super(badRequest(ModuleSecondaryErrorKey.UNKNOWN_FILE_TO_MOVE).message(buildMessage(filename)).addParameter("file", filename));
  }

  private static String buildMessage(String filename) {
    return "Can't move %s, can't find it in project".formatted(filename);
  }
}
