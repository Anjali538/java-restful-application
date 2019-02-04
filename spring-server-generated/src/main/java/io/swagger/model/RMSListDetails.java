package io.swagger.model;


import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RMSListDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class RMSListDetails   {
  @JsonProperty("ListID")
  private String listID = null;

  @JsonProperty("ListName")
  private String listName = null;
  


  public RMSListDetails listID(String listID) {
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

  public RMSListDetails listName(String listName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RMSListDetails rmSListDetails = (RMSListDetails) o;
    return Objects.equals(this.listID, rmSListDetails.listID) &&
        Objects.equals(this.listName, rmSListDetails.listName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listID, listName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RMSListDetails {\n");
    
    sb.append("    listID: ").append(toIndentedString(listID)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
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
