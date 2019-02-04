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
 * Hierarchy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class Hierarchy   {
  @JsonProperty("HierarchicalLevel")
  private String hierarchicalLevel = null;

  @JsonProperty("ListId")
  private String listId = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("ShortName")
  private String shortName = null;

  public Hierarchy hierarchicalLevel(String hierarchicalLevel) {
    this.hierarchicalLevel = hierarchicalLevel;
    return this;
  }

  /**
   * Get hierarchicalLevel
   * @return hierarchicalLevel
  **/
  @ApiModelProperty(value = "")

  public String getHierarchicalLevel() {
    return hierarchicalLevel;
  }

  public void setHierarchicalLevel(String hierarchicalLevel) {
    this.hierarchicalLevel = hierarchicalLevel;
  }

  public Hierarchy listId(String listId) {
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

  public Hierarchy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Hierarchy shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(value = "")

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hierarchy hierarchy = (Hierarchy) o;
    return Objects.equals(this.hierarchicalLevel, hierarchy.hierarchicalLevel) &&
        Objects.equals(this.listId, hierarchy.listId) &&
        Objects.equals(this.name, hierarchy.name) &&
        Objects.equals(this.shortName, hierarchy.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hierarchicalLevel, listId, name, shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hierarchy {\n");
    
    sb.append("    hierarchicalLevel: ").append(toIndentedString(hierarchicalLevel)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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
