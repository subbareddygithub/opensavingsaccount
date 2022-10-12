package com.ibm.dip.model.customeroffer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customeroffer.UpdateFacilityApplicationRequestCustomerOfferProcedure;
import com.ibm.dip.model.customeroffer.UpdateFacilityApplicationRequestFacilityApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateFacilityApplicationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:47:30.605Z[GMT]")

public class UpdateFacilityApplicationRequest   {
  @JsonProperty("CustomerOfferProcedure")
  private UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure;

  @JsonProperty("FacilityApplication")
  private UpdateFacilityApplicationRequestFacilityApplication facilityApplication;

  public UpdateFacilityApplicationRequest customerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
    return this;
  }

  /**
   * Get customerOfferProcedure
   * @return customerOfferProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateFacilityApplicationRequestCustomerOfferProcedure getCustomerOfferProcedure() {
    return customerOfferProcedure;
  }

  public void setCustomerOfferProcedure(UpdateFacilityApplicationRequestCustomerOfferProcedure customerOfferProcedure) {
    this.customerOfferProcedure = customerOfferProcedure;
  }

  public UpdateFacilityApplicationRequest facilityApplication(UpdateFacilityApplicationRequestFacilityApplication facilityApplication) {
    this.facilityApplication = facilityApplication;
    return this;
  }

  /**
   * Get facilityApplication
   * @return facilityApplication
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateFacilityApplicationRequestFacilityApplication getFacilityApplication() {
    return facilityApplication;
  }

  public void setFacilityApplication(UpdateFacilityApplicationRequestFacilityApplication facilityApplication) {
    this.facilityApplication = facilityApplication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFacilityApplicationRequest updateFacilityApplicationRequest = (UpdateFacilityApplicationRequest) o;
    return Objects.equals(this.customerOfferProcedure, updateFacilityApplicationRequest.customerOfferProcedure) &&
        Objects.equals(this.facilityApplication, updateFacilityApplicationRequest.facilityApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedure, facilityApplication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFacilityApplicationRequest {\n");
    
    sb.append("    customerOfferProcedure: ").append(toIndentedString(customerOfferProcedure)).append("\n");
    sb.append("    facilityApplication: ").append(toIndentedString(facilityApplication)).append("\n");
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

