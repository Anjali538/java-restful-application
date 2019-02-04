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
 * RegulatoryTerm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class RegulatoryTerm   {
  @JsonProperty("SourceName")
  private String sourceName = null;

  @JsonProperty("TermId")
  private String termId = null;

  @JsonProperty("TermName")
  private String termName = null;

  @JsonProperty("Status")
  private String status = null;

  public RegulatoryTerm sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

  /**
   * Get sourceName
   * @return sourceName
  **/
  @ApiModelProperty(value = "")

  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  public RegulatoryTerm termId(String termId) {
    this.termId = termId;
    return this;
  }

  /**
   * Get termId
   * @return termId
  **/
  @ApiModelProperty(value = "")

  public String getTermId() {
    return termId;
  }

  public void setTermId(String termId) {
    this.termId = termId;
  }

  public RegulatoryTerm termName(String termName) {
    this.termName = termName;
    return this;
  }

  /**
   * Get termName
   * @return termName
  **/
  @ApiModelProperty(value = "")

  public String getTermName() {
    return termName;
  }

  public void setTermName(String termName) {
    this.termName = termName;
  }

  public RegulatoryTerm status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatoryTerm regulatoryTerm = (RegulatoryTerm) o;
    return Objects.equals(this.sourceName, regulatoryTerm.sourceName) &&
        Objects.equals(this.termId, regulatoryTerm.termId) &&
        Objects.equals(this.termName, regulatoryTerm.termName) &&
        Objects.equals(this.status, regulatoryTerm.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceName, termId, termName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryTerm {\n");
    
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    termId: ").append(toIndentedString(termId)).append("\n");
    sb.append("    termName: ").append(toIndentedString(termName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
