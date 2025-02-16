package tech.jhipster.lite.project.infrastructure.secondary;

import tech.jhipster.lite.shared.error.domain.ProjectError;

enum ProjectErrorKey implements ProjectError {
  FORMATTING_ERROR("project-formatting-error"),
  ZIPPING_ERROR("project-zipping-error");

  private final String key;

  ProjectErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
