package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RegulatoryTerm;
import io.swagger.model.SourceTermDetail;
import io.swagger.model.Synonyms;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class ListItem   {
  @JsonProperty("ID")
  private String ID = null;

  @JsonProperty("PreferredTerm")
  private String preferredTerm = null;

  @JsonProperty("Abbreviation")
  private String abbreviation = null;

  @JsonProperty("LongName")
  private String longName = null;

  @JsonProperty("ShortName")
  private String shortName = null;

  @JsonProperty("Active")
  private Boolean active = null;

  @JsonProperty("Version")
  private Integer version = null;

  @JsonProperty("VersionDate")
  private String versionDate = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("CreatedOn")
  private LocalDate createdOn = null;

  @JsonProperty("ModifiedOn")
  private LocalDate modifiedOn = null;

  @JsonProperty("Synonyms")
  @Valid
  private List<Synonyms> synonyms = null;

  @JsonProperty("RegulatoryTerms")
  @Valid
  private List<RegulatoryTerm> regulatoryTerms = null;

  @JsonProperty("SourceTermDetails")
  @Valid
  private List<SourceTermDetail> sourceTermDetails = null;

  public ListItem ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
  **/
  @ApiModelProperty(value = "")

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public ListItem preferredTerm(String preferredTerm) {
    this.preferredTerm = preferredTerm;
    return this;
  }

  /**
   * Get preferredTerm
   * @return preferredTerm
  **/
  @ApiModelProperty(value = "")

  public String getPreferredTerm() {
    return preferredTerm;
  }

  public void setPreferredTerm(String preferredTerm) {
    this.preferredTerm = preferredTerm;
  }

  public ListItem abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * Get abbreviation
   * @return abbreviation
  **/
  @ApiModelProperty(value = "")

  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public ListItem longName(String longName) {
    this.longName = longName;
    return this;
  }

  /**
   * Get longName
   * @return longName
  **/
  @ApiModelProperty(value = "")

  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public ListItem shortName(String shortName) {
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

  public ListItem active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")

  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ListItem version(Integer version) {
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

  public ListItem versionDate(String versionDate) {
    this.versionDate = versionDate;
    return this;
  }

  /**
   * Get versionDate
   * @return versionDate
  **/
  @ApiModelProperty(value = "")

  public String getVersionDate() {
    return versionDate;
  }

  public void setVersionDate(String versionDate) {
    this.versionDate = versionDate;
  }

  public ListItem description(String description) {
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

  public ListItem createdOn(LocalDate createdOn) {
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

  public ListItem modifiedOn(LocalDate modifiedOn) {
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

  public ListItem synonyms(List<Synonyms> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public ListItem addSynonymsItem(Synonyms synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<Synonyms>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

  /**
   * Get synonyms
   * @return synonyms
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Synonyms> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<Synonyms> synonyms) {
    this.synonyms = synonyms;
  }

  public ListItem regulatoryTerms(List<RegulatoryTerm> regulatoryTerms) {
    this.regulatoryTerms = regulatoryTerms;
    return this;
  }

  public ListItem addRegulatoryTermsItem(RegulatoryTerm regulatoryTermsItem) {
    if (this.regulatoryTerms == null) {
      this.regulatoryTerms = new ArrayList<RegulatoryTerm>();
    }
    this.regulatoryTerms.add(regulatoryTermsItem);
    return this;
  }

  /**
   * Get regulatoryTerms
   * @return regulatoryTerms
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<RegulatoryTerm> getRegulatoryTerms() {
    return regulatoryTerms;
  }

  public void setRegulatoryTerms(List<RegulatoryTerm> regulatoryTerms) {
    this.regulatoryTerms = regulatoryTerms;
  }

  public ListItem sourceTermDetails(List<SourceTermDetail> sourceTermDetails) {
    this.sourceTermDetails = sourceTermDetails;
    return this;
  }

  public ListItem addSourceTermDetailsItem(SourceTermDetail sourceTermDetailsItem) {
    if (this.sourceTermDetails == null) {
      this.sourceTermDetails = new ArrayList<SourceTermDetail>();
    }
    this.sourceTermDetails.add(sourceTermDetailsItem);
    return this;
  }

  /**
   * Get sourceTermDetails
   * @return sourceTermDetails
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<SourceTermDetail> getSourceTermDetails() {
    return sourceTermDetails;
  }

  public void setSourceTermDetails(List<SourceTermDetail> sourceTermDetails) {
    this.sourceTermDetails = sourceTermDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListItem listItem = (ListItem) o;
    return Objects.equals(this.ID, listItem.ID) &&
        Objects.equals(this.preferredTerm, listItem.preferredTerm) &&
        Objects.equals(this.abbreviation, listItem.abbreviation) &&
        Objects.equals(this.longName, listItem.longName) &&
        Objects.equals(this.shortName, listItem.shortName) &&
        Objects.equals(this.active, listItem.active) &&
        Objects.equals(this.version, listItem.version) &&
        Objects.equals(this.versionDate, listItem.versionDate) &&
        Objects.equals(this.description, listItem.description) &&
        Objects.equals(this.createdOn, listItem.createdOn) &&
        Objects.equals(this.modifiedOn, listItem.modifiedOn) &&
        Objects.equals(this.synonyms, listItem.synonyms) &&
        Objects.equals(this.regulatoryTerms, listItem.regulatoryTerms) &&
        Objects.equals(this.sourceTermDetails, listItem.sourceTermDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, preferredTerm, abbreviation, longName, shortName, active, version, versionDate, description, createdOn, modifiedOn, synonyms, regulatoryTerms, sourceTermDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItem {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    preferredTerm: ").append(toIndentedString(preferredTerm)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionDate: ").append(toIndentedString(versionDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    regulatoryTerms: ").append(toIndentedString(regulatoryTerms)).append("\n");
    sb.append("    sourceTermDetails: ").append(toIndentedString(sourceTermDetails)).append("\n");
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
