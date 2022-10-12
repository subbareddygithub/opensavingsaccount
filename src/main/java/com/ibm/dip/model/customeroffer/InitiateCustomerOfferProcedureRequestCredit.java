package com.ibm.dip.model.customeroffer;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCustomerOfferProcedureRequestCredit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:47:30.605Z[GMT]")

public class InitiateCustomerOfferProcedureRequestCredit   {
  @JsonProperty("CustomerCreditRating")
  private String customerCreditRating;

  public InitiateCustomerOfferProcedureRequestCredit customerCreditRating(String customerCreditRating) {
    this.customerCreditRating = customerCreditRating;
    return this;
  }

  /**
   * Get customerCreditRating
   * @return customerCreditRating
  */
  @ApiModelProperty(value = "")


  public String getCustomerCreditRating() {
    return customerCreditRating;
  }

  public void setCustomerCreditRating(String customerCreditRating) {
    this.customerCreditRating = customerCreditRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCustomerOfferProcedureRequestCredit initiateCustomerOfferProcedureRequestCredit = (InitiateCustomerOfferProcedureRequestCredit) o;
    return Objects.equals(this.customerCreditRating, initiateCustomerOfferProcedureRequestCredit.customerCreditRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCreditRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCustomerOfferProcedureRequestCredit {\n");
    
    sb.append("    customerCreditRating: ").append(toIndentedString(customerCreditRating)).append("\n");
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

