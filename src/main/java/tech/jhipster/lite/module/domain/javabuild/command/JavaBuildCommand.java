package tech.jhipster.lite.module.domain.javabuild.command;

public sealed interface JavaBuildCommand
  permits JavaDependencyManagementCommand, GradleBuildCommand, MavenBuildCommand, GeneralCommandInterface {}
