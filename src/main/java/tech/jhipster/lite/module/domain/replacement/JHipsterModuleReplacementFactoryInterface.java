package tech.jhipster.lite.module.domain.replacement;

import java.util.stream.Stream;

public interface JHipsterModuleReplacementFactoryInterface {
  Stream<ContentReplacer> replacers();
}
