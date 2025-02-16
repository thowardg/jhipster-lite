package tech.jhipster.lite.module.domain.javabuild.command;

public sealed interface GradleBuildCommand
  extends JavaBuildCommand
  permits AddGradlePlugin, AddGradleConfiguration, AddGradleTasksTestInstruction {}
