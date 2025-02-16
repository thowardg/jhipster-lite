package tech.jhipster.lite.module.infrastructure.primary;

import tech.jhipster.lite.shared.error.domain.ProjectError;

enum ProjectFolderErrorKey implements ProjectError {
  INVALID_FOLDER("invalid-project-folder");

  private final String key;

  ProjectFolderErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
