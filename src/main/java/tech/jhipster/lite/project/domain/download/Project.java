package tech.jhipster.lite.project.domain.download;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import tech.jhipster.lite.shared.error.domain.Assert;
import tech.jhipster.lite.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

@SuppressWarnings("ArrayRecordComponent")
public record Project(ProjectName name, byte[] content) {
  public Project {
    Assert.notNull("name", name);
    Assert.notNull("content", content);
  }

  public long contentLength() {
    return content.length;
  }

  @Override
  @ExcludeFromGeneratedCodeCoverage
  public int hashCode() {
    return new HashCodeBuilder().append(name).append(content).hashCode();
  }

  @Override
  // java:S6878 disabled because fixed code triggers a prettier-java bug:
  // https://github.com/jhipster/prettier-java/issues/707
  @SuppressWarnings("java:S6878")
  @ExcludeFromGeneratedCodeCoverage
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Project other)) {
      return false;
    }

    return new EqualsBuilder().append(name, other.name()).append(content, other.content()).isEquals();
  }

  @Override
  @ExcludeFromGeneratedCodeCoverage
  public String toString() {
    return "Project [name=" + name + "]";
  }
}
