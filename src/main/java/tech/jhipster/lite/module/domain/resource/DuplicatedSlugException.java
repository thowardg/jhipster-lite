package tech.jhipster.lite.module.domain.resource;

import tech.jhipster.lite.shared.error.domain.ResourceSlugException;

class DuplicatedSlugException extends ResourceSlugException {

  public DuplicatedSlugException() {
    super(internalServerError(ResourceErrorKey.DUPLICATED_SLUG).message("Found a duplicated module slug, ensure that slugs are unique"));
  }
}
