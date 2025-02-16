package tech.jhipster.lite.project.domain.download;

import tech.jhipster.lite.shared.error.domain.GeneralError;

enum DownloadErrorKey implements GeneralError {
  INVALID_DOWNLOAD("invalid-download-folder");

  private final String key;

  DownloadErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
