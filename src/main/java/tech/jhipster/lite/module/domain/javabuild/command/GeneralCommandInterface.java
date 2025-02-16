package tech.jhipster.lite.module.domain.javabuild.command;

public sealed interface GeneralCommandInterface extends JavaBuildCommand permits AddJavaBuildProfile, SetBuildProperty, SetVersion {}
