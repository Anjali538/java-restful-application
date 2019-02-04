package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelatedTerm;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TermRelationship
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class TermRelationship   {
  @JsonProperty("RelationshipName")
  private String relationshipName = null;

  @JsonProperty("DisplayName")
  private String displayName = null;

  @JsonProperty("RelatedTerm")
  @Valid
  private List<RelatedTerm> relatedTerm = null;

  public TermRelationship relationshipName(String relationshipName) {
    this.relationshipName = relationshipName;
    return this;
  }

  /**
   * Get relationshipName
   * @return relationshipName
  **/
  @ApiModelProperty(value = "")

  public String getRelationshipName() {
    return relationshipName;
  }

  public void setRelationshipName(String relationshipName) {
    this.relationshipName = relationshipName;
  }

  public TermRelationship displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public TermRelationship relatedTerm(List<RelatedTerm> relatedTerm) {
    this.relatedTerm = relatedTerm;
    return this;
  }

  public TermRelationship addRelatedTermItem(RelatedTerm relatedTermItem) {
    if (this.relatedTerm == null) {
      this.relatedTerm = new ArrayList<RelatedTerm>();
    }
    this.relatedTerm.add(relatedTermItem);
    return this;
  }

  /**
   * Get relatedTerm
   * @return relatedTerm
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<RelatedTerm> getRelatedTerm() {
    return relatedTerm;
  }

  public void setRelatedTerm(List<RelatedTerm> relatedTerm) {
    this.relatedTerm = relatedTerm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermRelationship termRelationship = (TermRelationship) o;
    return Objects.equals(this.relationshipName, termRelationship.relationshipName) &&
        Objects.equals(this.displayName, termRelationship.displayName) &&
        Objects.equals(this.relatedTerm, termRelationship.relatedTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationshipName, displayName, relatedTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermRelationship {\n");
    
    sb.append("    relationshipName: ").append(toIndentedString(relationshipName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    relatedTerm: ").append(toIndentedString(relatedTerm)).append("\n");
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
