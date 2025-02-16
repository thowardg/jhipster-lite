package tech.jhipster.lite.module.domain.docker;

import tech.jhipster.lite.shared.error.domain.InfrastructureError;

enum DockerErrorKey implements InfrastructureError {
  UNKNOWN_DOCKER_IMAGE("unknown-docker-image");

  private final String key;

  DockerErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
