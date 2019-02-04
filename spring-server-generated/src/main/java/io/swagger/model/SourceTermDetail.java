package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Current;
import io.swagger.model.ExtendedAttribute;
import io.swagger.model.Mapping;
import io.swagger.model.TermDomain;
import io.swagger.model.TermName;
import io.swagger.model.TermRelationship;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SourceTermDetail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-02T10:28:28.762Z[GMT]")
public class SourceTermDetail   {
  @JsonProperty("SourceName")
  private String sourceName = null;

  @JsonProperty("TermId")
  private String termId = null;

  @JsonProperty("Version")
  private Integer version = null;

  @JsonProperty("VersionDate")
  private LocalDate versionDate = null;

  @JsonProperty("CreatedOn")
  private LocalDate createdOn = null;

  @JsonProperty("ModifiedOn")
  private LocalDate modifiedOn = null;

  @JsonProperty("TermDomains")
  @Valid
  private List<TermDomain> termDomains = null;

  @JsonProperty("TermNames")
  @Valid
  private List<TermName> termNames = null;

  @JsonProperty("TermExtendedAttributes")
  @Valid
  private List<ExtendedAttribute> termExtendedAttributes = null;

  @JsonProperty("Currents")
  @Valid
  private List<Current> currents = null;

  @JsonProperty("TermMappings")
  @Valid
  private List<Mapping> termMappings = null;

  @JsonProperty("TermRelationships")
  @Valid
  private List<TermRelationship> termRelationships = null;

  public SourceTermDetail sourceName(String sourceName) {
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

  public SourceTermDetail termId(String termId) {
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

  public SourceTermDetail version(Integer version) {
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

  public SourceTermDetail versionDate(LocalDate versionDate) {
    this.versionDate = versionDate;
    return this;
  }

  /**
   * Get versionDate
   * @return versionDate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public LocalDate getVersionDate() {
    return versionDate;
  }

  public void setVersionDate(LocalDate versionDate) {
    this.versionDate = versionDate;
  }

  public SourceTermDetail createdOn(LocalDate createdOn) {
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

  public SourceTermDetail modifiedOn(LocalDate modifiedOn) {
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

  public SourceTermDetail termDomains(List<TermDomain> termDomains) {
    this.termDomains = termDomains;
    return this;
  }

  public SourceTermDetail addTermDomainsItem(TermDomain termDomainsItem) {
    if (this.termDomains == null) {
      this.termDomains = new ArrayList<TermDomain>();
    }
    this.termDomains.add(termDomainsItem);
    return this;
  }

  /**
   * Get termDomains
   * @return termDomains
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<TermDomain> getTermDomains() {
    return termDomains;
  }

  public void setTermDomains(List<TermDomain> termDomains) {
    this.termDomains = termDomains;
  }

  public SourceTermDetail termNames(List<TermName> termNames) {
    this.termNames = termNames;
    return this;
  }

  public SourceTermDetail addTermNamesItem(TermName termNamesItem) {
    if (this.termNames == null) {
      this.termNames = new ArrayList<TermName>();
    }
    this.termNames.add(termNamesItem);
    return this;
  }

  /**
   * Get termNames
   * @return termNames
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<TermName> getTermNames() {
    return termNames;
  }

  public void setTermNames(List<TermName> termNames) {
    this.termNames = termNames;
  }

  public SourceTermDetail termExtendedAttributes(List<ExtendedAttribute> termExtendedAttributes) {
    this.termExtendedAttributes = termExtendedAttributes;
    return this;
  }

  public SourceTermDetail addTermExtendedAttributesItem(ExtendedAttribute termExtendedAttributesItem) {
    if (this.termExtendedAttributes == null) {
      this.termExtendedAttributes = new ArrayList<ExtendedAttribute>();
    }
    this.termExtendedAttributes.add(termExtendedAttributesItem);
    return this;
  }

  /**
   * Get termExtendedAttributes
   * @return termExtendedAttributes
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ExtendedAttribute> getTermExtendedAttributes() {
    return termExtendedAttributes;
  }

  public void setTermExtendedAttributes(List<ExtendedAttribute> termExtendedAttributes) {
    this.termExtendedAttributes = termExtendedAttributes;
  }

  public SourceTermDetail currents(List<Current> currents) {
    this.currents = currents;
    return this;
  }

  public SourceTermDetail addCurrentsItem(Current currentsItem) {
    if (this.currents == null) {
      this.currents = new ArrayList<Current>();
    }
    this.currents.add(currentsItem);
    return this;
  }

  /**
   * Get currents
   * @return currents
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Current> getCurrents() {
    return currents;
  }

  public void setCurrents(List<Current> currents) {
    this.currents = currents;
  }

  public SourceTermDetail termMappings(List<Mapping> termMappings) {
    this.termMappings = termMappings;
    return this;
  }

  public SourceTermDetail addTermMappingsItem(Mapping termMappingsItem) {
    if (this.termMappings == null) {
      this.termMappings = new ArrayList<Mapping>();
    }
    this.termMappings.add(termMappingsItem);
    return this;
  }

  /**
   * Get termMappings
   * @return termMappings
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Mapping> getTermMappings() {
    return termMappings;
  }

  public void setTermMappings(List<Mapping> termMappings) {
    this.termMappings = termMappings;
  }

  public SourceTermDetail termRelationships(List<TermRelationship> termRelationships) {
    this.termRelationships = termRelationships;
    return this;
  }

  public SourceTermDetail addTermRelationshipsItem(TermRelationship termRelationshipsItem) {
    if (this.termRelationships == null) {
      this.termRelationships = new ArrayList<TermRelationship>();
    }
    this.termRelationships.add(termRelationshipsItem);
    return this;
  }

  /**
   * Get termRelationships
   * @return termRelationships
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<TermRelationship> getTermRelationships() {
    return termRelationships;
  }

  public void setTermRelationships(List<TermRelationship> termRelationships) {
    this.termRelationships = termRelationships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceTermDetail sourceTermDetail = (SourceTermDetail) o;
    return Objects.equals(this.sourceName, sourceTermDetail.sourceName) &&
        Objects.equals(this.termId, sourceTermDetail.termId) &&
        Objects.equals(this.version, sourceTermDetail.version) &&
        Objects.equals(this.versionDate, sourceTermDetail.versionDate) &&
        Objects.equals(this.createdOn, sourceTermDetail.createdOn) &&
        Objects.equals(this.modifiedOn, sourceTermDetail.modifiedOn) &&
        Objects.equals(this.termDomains, sourceTermDetail.termDomains) &&
        Objects.equals(this.termNames, sourceTermDetail.termNames) &&
        Objects.equals(this.termExtendedAttributes, sourceTermDetail.termExtendedAttributes) &&
        Objects.equals(this.currents, sourceTermDetail.currents) &&
        Objects.equals(this.termMappings, sourceTermDetail.termMappings) &&
        Objects.equals(this.termRelationships, sourceTermDetail.termRelationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceName, termId, version, versionDate, createdOn, modifiedOn, termDomains, termNames, termExtendedAttributes, currents, termMappings, termRelationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceTermDetail {\n");
    
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    termId: ").append(toIndentedString(termId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionDate: ").append(toIndentedString(versionDate)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    termDomains: ").append(toIndentedString(termDomains)).append("\n");
    sb.append("    termNames: ").append(toIndentedString(termNames)).append("\n");
    sb.append("    termExtendedAttributes: ").append(toIndentedString(termExtendedAttributes)).append("\n");
    sb.append("    currents: ").append(toIndentedString(currents)).append("\n");
    sb.append("    termMappings: ").append(toIndentedString(termMappings)).append("\n");
    sb.append("    termRelationships: ").append(toIndentedString(termRelationships)).append("\n");
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
