package tech.jhipster.lite.module.domain.javadependency;

import tech.jhipster.lite.shared.error.domain.DependencyManagementError;

enum JavaDependencyErrorKey implements DependencyManagementError {
  UNKNOWN_VERSION("unknown-java-version");

  private final String key;

  JavaDependencyErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
