package tech.jhipster.lite.module.infrastructure.secondary.javadependency.maven;

import tech.jhipster.lite.shared.error.domain.JavaException;

class MalformedAdditionalInformationException extends JavaException {

  public MalformedAdditionalInformationException(Throwable cause) {
    super(
      internalServerError(MavenDependencyErrorKey.MALFORMED_ADDITIONAL_INFORMATION)
        .message("Malformed XML additional elements for plugin")
        .cause(cause)
    );
  }
}
