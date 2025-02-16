package tech.jhipster.lite.module.domain.javabuild.command;

public sealed interface JavaDependencyManagementCommand
  extends JavaBuildCommand
  permits AddDirectJavaDependency, AddJavaDependencyManagement, RemoveDirectJavaDependency, RemoveJavaDependencyManagement {}
