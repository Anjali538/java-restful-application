package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SynonymItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Synonyms
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class Synonyms   {
  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Value")
  private String value = null;

  @JsonProperty("SynonymItem")
  @Valid
  private List<SynonymItem> synonymItem = null;

  public Synonyms name(String name) {
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

  public Synonyms value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Synonyms synonymItem(List<SynonymItem> synonymItem) {
    this.synonymItem = synonymItem;
    return this;
  }

  public Synonyms addSynonymItemItem(SynonymItem synonymItemItem) {
    if (this.synonymItem == null) {
      this.synonymItem = new ArrayList<SynonymItem>();
    }
    this.synonymItem.add(synonymItemItem);
    return this;
  }

  /**
   * Get synonymItem
   * @return synonymItem
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<SynonymItem> getSynonymItem() {
    return synonymItem;
  }

  public void setSynonymItem(List<SynonymItem> synonymItem) {
    this.synonymItem = synonymItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Synonyms synonyms = (Synonyms) o;
    return Objects.equals(this.name, synonyms.name) &&
        Objects.equals(this.value, synonyms.value) &&
        Objects.equals(this.synonymItem, synonyms.synonymItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, synonymItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Synonyms {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    synonymItem: ").append(toIndentedString(synonymItem)).append("\n");
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
