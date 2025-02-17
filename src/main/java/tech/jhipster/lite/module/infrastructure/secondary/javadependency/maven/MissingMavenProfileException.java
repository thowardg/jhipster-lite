package tech.jhipster.lite.module.infrastructure.secondary.javadependency.maven;

import tech.jhipster.lite.module.domain.javabuildprofile.BuildProfileId;
import tech.jhipster.lite.shared.error.domain.JavaException;

class MissingMavenProfileException extends JavaException {

  public MissingMavenProfileException(BuildProfileId profileId) {
    super(badRequest(MavenDependencyErrorKey.MISSING_PROFILE).message("Your pom.xml file does not contain the profile " + profileId));
  }
}
