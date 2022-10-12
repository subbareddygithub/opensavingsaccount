package com.ibm.dip.model.partylifecyclemanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.partylifecyclemanagement.InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePartyRelationshipProcedureRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:47:38.894Z[GMT]")

public class InitiatePartyRelationshipProcedureRequest   {
  @JsonProperty("PartyRelationshipProcedure")
  private InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure partyRelationshipProcedure;

  public InitiatePartyRelationshipProcedureRequest partyRelationshipProcedure(InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure partyRelationshipProcedure) {
    this.partyRelationshipProcedure = partyRelationshipProcedure;
    return this;
  }

  /**
   * Get partyRelationshipProcedure
   * @return partyRelationshipProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure getPartyRelationshipProcedure() {
    return partyRelationshipProcedure;
  }

  public void setPartyRelationshipProcedure(InitiatePartyRelationshipProcedureRequestPartyRelationshipProcedure partyRelationshipProcedure) {
    this.partyRelationshipProcedure = partyRelationshipProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePartyRelationshipProcedureRequest initiatePartyRelationshipProcedureRequest = (InitiatePartyRelationshipProcedureRequest) o;
    return Objects.equals(this.partyRelationshipProcedure, initiatePartyRelationshipProcedureRequest.partyRelationshipProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRelationshipProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePartyRelationshipProcedureRequest {\n");
    
    sb.append("    partyRelationshipProcedure: ").append(toIndentedString(partyRelationshipProcedure)).append("\n");
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

