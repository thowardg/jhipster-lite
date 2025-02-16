package tech.jhipster.lite.module.domain.javabuild.command;

public sealed interface MavenBuildCommand
  extends JavaBuildCommand
  permits AddMavenPluginManagement, AddDirectMavenPlugin, AddMavenBuildExtension {}
