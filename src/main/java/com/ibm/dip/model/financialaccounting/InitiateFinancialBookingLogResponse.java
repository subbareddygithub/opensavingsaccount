package com.ibm.dip.model.financialaccounting;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.financialaccounting.InitiateFinancialBookingLogResponseFinancialBookingLog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateFinancialBookingLogResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:48:04.204Z[GMT]")

public class InitiateFinancialBookingLogResponse   {
  @JsonProperty("FinancialBookingLog")
  private InitiateFinancialBookingLogResponseFinancialBookingLog financialBookingLog;

  public InitiateFinancialBookingLogResponse financialBookingLog(InitiateFinancialBookingLogResponseFinancialBookingLog financialBookingLog) {
    this.financialBookingLog = financialBookingLog;
    return this;
  }

  /**
   * Get financialBookingLog
   * @return financialBookingLog
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateFinancialBookingLogResponseFinancialBookingLog getFinancialBookingLog() {
    return financialBookingLog;
  }

  public void setFinancialBookingLog(InitiateFinancialBookingLogResponseFinancialBookingLog financialBookingLog) {
    this.financialBookingLog = financialBookingLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateFinancialBookingLogResponse initiateFinancialBookingLogResponse = (InitiateFinancialBookingLogResponse) o;
    return Objects.equals(this.financialBookingLog, initiateFinancialBookingLogResponse.financialBookingLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financialBookingLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateFinancialBookingLogResponse {\n");
    
    sb.append("    financialBookingLog: ").append(toIndentedString(financialBookingLog)).append("\n");
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

