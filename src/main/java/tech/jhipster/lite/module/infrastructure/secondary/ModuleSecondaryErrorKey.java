package tech.jhipster.lite.module.infrastructure.secondary;

import tech.jhipster.lite.shared.error.domain.MiscellaneousError2;

enum ModuleSecondaryErrorKey implements MiscellaneousError2 {
  MISSING_PACKAGE_JSON("missing-package-json"),
  UNKNOWN_FILE_TO_DELETE("unknown-file-to-delete"),
  UNKNOWN_FILE_TO_MOVE("unknown-file-to-move");

  private final String key;

  ModuleSecondaryErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
