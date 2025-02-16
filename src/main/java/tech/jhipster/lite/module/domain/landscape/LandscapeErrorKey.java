package tech.jhipster.lite.module.domain.landscape;

import tech.jhipster.lite.shared.error.domain.ProjectError;

enum LandscapeErrorKey implements ProjectError {
  DUPLICATED_SLUG("duplicated-landscape-slug"),
  UNKNOWN_DEPENDENCY("unknown-landscape-dependency"),
  MISSING_ROOT_ELEMENT("missing-landscape-root");

  private final String key;

  LandscapeErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
