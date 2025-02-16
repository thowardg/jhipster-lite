package tech.jhipster.lite.module.domain.resource;

import tech.jhipster.lite.shared.error.domain.InfrastructureError;

enum ResourceErrorKey implements InfrastructureError {
  DUPLICATED_SLUG("duplicated-slug"),
  INVALID_TAG("invalid-tag"),
  UNKNOWN_SLUG("unknown-slug");

  private final String key;

  ResourceErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
