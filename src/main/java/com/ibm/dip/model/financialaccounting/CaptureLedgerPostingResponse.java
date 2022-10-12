package com.ibm.dip.model.financialaccounting;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.financialaccounting.CaptureLedgerPostingResponseLedgerPosting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureLedgerPostingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:48:04.204Z[GMT]")

public class CaptureLedgerPostingResponse   {
  @JsonProperty("LedgerPosting")
  private CaptureLedgerPostingResponseLedgerPosting ledgerPosting;

  public CaptureLedgerPostingResponse ledgerPosting(CaptureLedgerPostingResponseLedgerPosting ledgerPosting) {
    this.ledgerPosting = ledgerPosting;
    return this;
  }

  /**
   * Get ledgerPosting
   * @return ledgerPosting
  */
  @ApiModelProperty(value = "")

  @Valid

  public CaptureLedgerPostingResponseLedgerPosting getLedgerPosting() {
    return ledgerPosting;
  }

  public void setLedgerPosting(CaptureLedgerPostingResponseLedgerPosting ledgerPosting) {
    this.ledgerPosting = ledgerPosting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureLedgerPostingResponse captureLedgerPostingResponse = (CaptureLedgerPostingResponse) o;
    return Objects.equals(this.ledgerPosting, captureLedgerPostingResponse.ledgerPosting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ledgerPosting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureLedgerPostingResponse {\n");
    
    sb.append("    ledgerPosting: ").append(toIndentedString(ledgerPosting)).append("\n");
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

