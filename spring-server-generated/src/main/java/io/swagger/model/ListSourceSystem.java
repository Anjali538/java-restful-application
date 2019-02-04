package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Hierarchy;
import io.swagger.model.ListDomain;
import io.swagger.model.ListRelationship;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ListSourceSystem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class ListSourceSystem   {
  @JsonProperty("SourceName")
  private String sourceName = null;

  @JsonProperty("ListId")
  private String listId = null;

  @JsonProperty("ListName")
  private String listName = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("ListDomains")
  @Valid
  private List<ListDomain> listDomains = null;

  @JsonProperty("ListRelationships")
  @Valid
  private List<ListRelationship> listRelationships = null;

  @JsonProperty("ListHierarchy")
  @Valid
  private List<Hierarchy> listHierarchy = null;

  public ListSourceSystem sourceName(String sourceName) {
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

  public ListSourceSystem listId(String listId) {
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

  public ListSourceSystem listName(String listName) {
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

  public ListSourceSystem status(String status) {
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

  public ListSourceSystem listDomains(List<ListDomain> listDomains) {
    this.listDomains = listDomains;
    return this;
  }

  public ListSourceSystem addListDomainsItem(ListDomain listDomainsItem) {
    if (this.listDomains == null) {
      this.listDomains = new ArrayList<ListDomain>();
    }
    this.listDomains.add(listDomainsItem);
    return this;
  }

  /**
   * Get listDomains
   * @return listDomains
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ListDomain> getListDomains() {
    return listDomains;
  }

  public void setListDomains(List<ListDomain> listDomains) {
    this.listDomains = listDomains;
  }

  public ListSourceSystem listRelationships(List<ListRelationship> listRelationships) {
    this.listRelationships = listRelationships;
    return this;
  }

  public ListSourceSystem addListRelationshipsItem(ListRelationship listRelationshipsItem) {
    if (this.listRelationships == null) {
      this.listRelationships = new ArrayList<ListRelationship>();
    }
    this.listRelationships.add(listRelationshipsItem);
    return this;
  }

  /**
   * Get listRelationships
   * @return listRelationships
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ListRelationship> getListRelationships() {
    return listRelationships;
  }

  public void setListRelationships(List<ListRelationship> listRelationships) {
    this.listRelationships = listRelationships;
  }

  public ListSourceSystem listHierarchy(List<Hierarchy> listHierarchy) {
    this.listHierarchy = listHierarchy;
    return this;
  }

  public ListSourceSystem addListHierarchyItem(Hierarchy listHierarchyItem) {
    if (this.listHierarchy == null) {
      this.listHierarchy = new ArrayList<Hierarchy>();
    }
    this.listHierarchy.add(listHierarchyItem);
    return this;
  }

  /**
   * Get listHierarchy
   * @return listHierarchy
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Hierarchy> getListHierarchy() {
    return listHierarchy;
  }

  public void setListHierarchy(List<Hierarchy> listHierarchy) {
    this.listHierarchy = listHierarchy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSourceSystem listSourceSystem = (ListSourceSystem) o;
    return Objects.equals(this.sourceName, listSourceSystem.sourceName) &&
        Objects.equals(this.listId, listSourceSystem.listId) &&
        Objects.equals(this.listName, listSourceSystem.listName) &&
        Objects.equals(this.status, listSourceSystem.status) &&
        Objects.equals(this.listDomains, listSourceSystem.listDomains) &&
        Objects.equals(this.listRelationships, listSourceSystem.listRelationships) &&
        Objects.equals(this.listHierarchy, listSourceSystem.listHierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceName, listId, listName, status, listDomains, listRelationships, listHierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSourceSystem {\n");
    
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    listDomains: ").append(toIndentedString(listDomains)).append("\n");
    sb.append("    listRelationships: ").append(toIndentedString(listRelationships)).append("\n");
    sb.append("    listHierarchy: ").append(toIndentedString(listHierarchy)).append("\n");
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
