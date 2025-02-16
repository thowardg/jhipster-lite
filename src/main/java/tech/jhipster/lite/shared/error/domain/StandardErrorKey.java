package tech.jhipster.lite.shared.error.domain;

public enum StandardErrorKey implements GeneralError {
  BAD_REQUEST("bad-request"),
  INTERNAL_SERVER_ERROR("internal-server-error");

  private final String key;

  StandardErrorKey(String key) {
    this.key = key;
  }

  @Override
  public String get() {
    return key;
  }
}
