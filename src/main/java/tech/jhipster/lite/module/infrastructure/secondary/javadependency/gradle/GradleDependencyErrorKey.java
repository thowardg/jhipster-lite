package tech.jhipster.lite.module.infrastructure.secondary.javadependency.gradle;

import tech.jhipster.lite.shared.error.domain.DependencyManagementError;

enum GradleDependencyErrorKey implements DependencyManagementError {
  INVALID_TOML_VERSION_CATALOG("invalid-toml-version-catalog-file"),
  MISSING_PROFILE("missing-gradle-profile");

  private final String key;

  GradleDependencyErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
