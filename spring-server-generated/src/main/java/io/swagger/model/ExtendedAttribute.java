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
 * ExtendedAttribute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class ExtendedAttribute   {
  @JsonProperty("ListId")
  private String listId = null;

  @JsonProperty("ListName")
  private String listName = null;

  @JsonProperty("TermId")
  private String termId = null;

  @JsonProperty("TermName")
  private String termName = null;

  public ExtendedAttribute listId(String listId) {
    this.listId = listId;
    return this;
  }

  /**
   * Get listId
   * @return listId
  **/
  @ApiModelProperty(value = "")

  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }

  public ExtendedAttribute listName(String listName) {
    this.listName = listName;
    return this;
  }

  /**
   * Get listName
   * @return listName
  **/
  @ApiModelProperty(value = "")

  public String getListName() {
    return listName;
  }

  public void setListName(String listName) {
    this.listName = listName;
  }

  public ExtendedAttribute termId(String termId) {
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

  public ExtendedAttribute termName(String termName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedAttribute extendedAttribute = (ExtendedAttribute) o;
    return Objects.equals(this.listId, extendedAttribute.listId) &&
        Objects.equals(this.listName, extendedAttribute.listName) &&
        Objects.equals(this.termId, extendedAttribute.termId) &&
        Objects.equals(this.termName, extendedAttribute.termName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, listName, termId, termName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedAttribute {\n");
    
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    termId: ").append(toIndentedString(termId)).append("\n");
    sb.append("    termName: ").append(toIndentedString(termName)).append("\n");
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
