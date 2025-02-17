package tech.jhipster.lite.project.domain.download;

import tech.jhipster.lite.shared.error.domain.ProjectException;

class InvalidDownloadException extends ProjectException {

  public InvalidDownloadException() {
    super(badRequest(DownloadErrorKey.INVALID_DOWNLOAD).message("A user tried to download a project from a protected folder"));
  }
}
