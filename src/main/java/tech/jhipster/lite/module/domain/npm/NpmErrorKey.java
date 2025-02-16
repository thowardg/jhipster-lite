package tech.jhipster.lite.module.domain.npm;

import tech.jhipster.lite.shared.error.domain.MiscellaneousError2;

enum NpmErrorKey implements MiscellaneousError2 {
  UNKNOWN_PACKAGE("unknown-npm-package");

  private final String key;

  NpmErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
