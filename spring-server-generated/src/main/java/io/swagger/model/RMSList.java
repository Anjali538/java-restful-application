package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ListItem;
import io.swagger.model.ListSourceSystem;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RMSList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class RMSList   {
  @JsonProperty("ListID")
  private String listID = null;

  @JsonProperty("ListName")
  private String listName = null;

  @JsonProperty("ShortName")
  private String shortName = null;

  @JsonProperty("Version")
  private Integer version = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("ListItems")
  @Valid
  private List<ListItem> listItems = null;

  @JsonProperty("ListSourceSystems")
  @Valid
  private List<ListSourceSystem> listSourceSystems = null;

  @JsonProperty("CreatedOn")
  private LocalDate createdOn = null;

  @JsonProperty("ModifiedOn")
  private LocalDate modifiedOn = null;

  public RMSList listID(String listID) {
    this.listID = listID;
    return this;
  }

  /**
   * Get listID
   * @return listID
  **/
  @ApiModelProperty(value = "")

  public String getListID() {
    return listID;
  }

  public void setListID(String listID) {
    this.listID = listID;
  }

  public RMSList listName(String listName) {
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

  public RMSList shortName(String shortName) {
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

  public RMSList version(Integer version) {
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

  public RMSList status(String status) {
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

  public RMSList description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RMSList listItems(List<ListItem> listItems) {
    this.listItems = listItems;
    return this;
  }

  public RMSList addListItemsItem(ListItem listItemsItem) {
    if (this.listItems == null) {
      this.listItems = new ArrayList<ListItem>();
    }
    this.listItems.add(listItemsItem);
    return this;
  }

  /**
   * Get listItems
   * @return listItems
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ListItem> getListItems() {
    return listItems;
  }

  public void setListItems(List<ListItem> listItems) {
    this.listItems = listItems;
  }

  public RMSList listSourceSystems(List<ListSourceSystem> listSourceSystems) {
    this.listSourceSystems = listSourceSystems;
    return this;
  }

  public RMSList addListSourceSystemsItem(ListSourceSystem listSourceSystemsItem) {
    if (this.listSourceSystems == null) {
      this.listSourceSystems = new ArrayList<ListSourceSystem>();
    }
    this.listSourceSystems.add(listSourceSystemsItem);
    return this;
  }

  /**
   * Get listSourceSystems
   * @return listSourceSystems
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ListSourceSystem> getListSourceSystems() {
    return listSourceSystems;
  }

  public void setListSourceSystems(List<ListSourceSystem> listSourceSystems) {
    this.listSourceSystems = listSourceSystems;
  }

  public RMSList createdOn(LocalDate createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDate createdOn) {
    this.createdOn = createdOn;
  }

  public RMSList modifiedOn(LocalDate modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(LocalDate modifiedOn) {
    this.modifiedOn = modifiedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RMSList rmSList = (RMSList) o;
    return Objects.equals(this.listID, rmSList.listID) &&
        Objects.equals(this.listName, rmSList.listName) &&
        Objects.equals(this.shortName, rmSList.shortName) &&
        Objects.equals(this.version, rmSList.version) &&
        Objects.equals(this.status, rmSList.status) &&
        Objects.equals(this.description, rmSList.description) &&
        Objects.equals(this.listItems, rmSList.listItems) &&
        Objects.equals(this.listSourceSystems, rmSList.listSourceSystems) &&
        Objects.equals(this.createdOn, rmSList.createdOn) &&
        Objects.equals(this.modifiedOn, rmSList.modifiedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listID, listName, shortName, version, status, description, listItems, listSourceSystems, createdOn, modifiedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RMSList {\n");
    
    sb.append("    listID: ").append(toIndentedString(listID)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    listItems: ").append(toIndentedString(listItems)).append("\n");
    sb.append("    listSourceSystems: ").append(toIndentedString(listSourceSystems)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
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
