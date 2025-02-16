package tech.jhipster.lite.module.domain.javabuild.command;

import tech.jhipster.lite.module.domain.javabuild.MavenBuildExtension;
import tech.jhipster.lite.shared.error.domain.Assert;

public record AddMavenBuildExtension(MavenBuildExtension buildExtension) implements MavenBuildCommand {
  public AddMavenBuildExtension {
    Assert.notNull("buildExtension", buildExtension);
  }
}
