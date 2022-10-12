package com.ibm.dip.model.savingsaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.savingsaccount.UpdateSavingsAccountFacilityRequestSavingsAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateSavingsAccountFacilityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:47:44.400Z[GMT]")

public class UpdateSavingsAccountFacilityResponse   {
  @JsonProperty("SavingsAccountFacility")
  private UpdateSavingsAccountFacilityRequestSavingsAccountFacility savingsAccountFacility;

  public UpdateSavingsAccountFacilityResponse savingsAccountFacility(UpdateSavingsAccountFacilityRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
    return this;
  }

  /**
   * Get savingsAccountFacility
   * @return savingsAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateSavingsAccountFacilityRequestSavingsAccountFacility getSavingsAccountFacility() {
    return savingsAccountFacility;
  }

  public void setSavingsAccountFacility(UpdateSavingsAccountFacilityRequestSavingsAccountFacility savingsAccountFacility) {
    this.savingsAccountFacility = savingsAccountFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSavingsAccountFacilityResponse updateSavingsAccountFacilityResponse = (UpdateSavingsAccountFacilityResponse) o;
    return Objects.equals(this.savingsAccountFacility, updateSavingsAccountFacilityResponse.savingsAccountFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savingsAccountFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSavingsAccountFacilityResponse {\n");
    
    sb.append("    savingsAccountFacility: ").append(toIndentedString(savingsAccountFacility)).append("\n");
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

