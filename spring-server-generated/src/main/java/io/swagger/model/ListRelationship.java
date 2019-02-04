package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelatedList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ListRelationship
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class ListRelationship   {
  @JsonProperty("RelationshipName")
  private String relationshipName = null;

  @JsonProperty("DisplayName")
  private String displayName = null;

  @JsonProperty("RelatedList")
  @Valid
  private List<RelatedList> relatedList = null;

  public ListRelationship relationshipName(String relationshipName) {
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

  public ListRelationship displayName(String displayName) {
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

  public ListRelationship relatedList(List<RelatedList> relatedList) {
    this.relatedList = relatedList;
    return this;
  }

  public ListRelationship addRelatedListItem(RelatedList relatedListItem) {
    if (this.relatedList == null) {
      this.relatedList = new ArrayList<RelatedList>();
    }
    this.relatedList.add(relatedListItem);
    return this;
  }

  /**
   * Get relatedList
   * @return relatedList
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<RelatedList> getRelatedList() {
    return relatedList;
  }

  public void setRelatedList(List<RelatedList> relatedList) {
    this.relatedList = relatedList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRelationship listRelationship = (ListRelationship) o;
    return Objects.equals(this.relationshipName, listRelationship.relationshipName) &&
        Objects.equals(this.displayName, listRelationship.displayName) &&
        Objects.equals(this.relatedList, listRelationship.relatedList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationshipName, displayName, relatedList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRelationship {\n");
    
    sb.append("    relationshipName: ").append(toIndentedString(relationshipName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    relatedList: ").append(toIndentedString(relatedList)).append("\n");
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
