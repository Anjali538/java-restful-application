package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mapping
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class Mapping   {
  @JsonProperty("SourceTermId")
  private String sourceTermId = null;

  @JsonProperty("SourceTermName")
  private String sourceTermName = null;

  @JsonProperty("Version")
  private Integer version = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("IsMainSource")
  private String isMainSource = null;

  public Mapping sourceTermId(String sourceTermId) {
    this.sourceTermId = sourceTermId;
    return this;
  }

  /**
   * Get sourceTermId
   * @return sourceTermId
  **/
  @ApiModelProperty(value = "")

  public String getSourceTermId() {
    return sourceTermId;
  }

  public void setSourceTermId(String sourceTermId) {
    this.sourceTermId = sourceTermId;
  }

  public Mapping sourceTermName(String sourceTermName) {
    this.sourceTermName = sourceTermName;
    return this;
  }

  /**
   * Get sourceTermName
   * @return sourceTermName
  **/
  @ApiModelProperty(value = "")

  public String getSourceTermName() {
    return sourceTermName;
  }

  public void setSourceTermName(String sourceTermName) {
    this.sourceTermName = sourceTermName;
  }

  public Mapping version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Mapping status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Mapping isMainSource(String isMainSource) {
    this.isMainSource = isMainSource;
    return this;
  }

  /**
   * Get isMainSource
   * @return isMainSource
  **/
  @ApiModelProperty(value = "")

  public String getIsMainSource() {
    return isMainSource;
  }

  public void setIsMainSource(String isMainSource) {
    this.isMainSource = isMainSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mapping mapping = (Mapping) o;
    return Objects.equals(this.sourceTermId, mapping.sourceTermId) &&
        Objects.equals(this.sourceTermName, mapping.sourceTermName) &&
        Objects.equals(this.version, mapping.version) &&
        Objects.equals(this.status, mapping.status) &&
        Objects.equals(this.isMainSource, mapping.isMainSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceTermId, sourceTermName, version, status, isMainSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mapping {\n");
    
    sb.append("    sourceTermId: ").append(toIndentedString(sourceTermId)).append("\n");
    sb.append("    sourceTermName: ").append(toIndentedString(sourceTermName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isMainSource: ").append(toIndentedString(isMainSource)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
