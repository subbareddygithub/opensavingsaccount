package com.ibm.dip.model.issueddeviceadministration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issueddeviceadministration.CapturePasswordAssignmentRequestPasswordAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaptureReaderAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:47:57.112Z[GMT]")

public class CaptureReaderAssignmentResponse   {
  @JsonProperty("ReaderAssignment")
  private CapturePasswordAssignmentRequestPasswordAssignment readerAssignment;

  public CaptureReaderAssignmentResponse readerAssignment(CapturePasswordAssignmentRequestPasswordAssignment readerAssignment) {
    this.readerAssignment = readerAssignment;
    return this;
  }

  /**
   * Get readerAssignment
   * @return readerAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public CapturePasswordAssignmentRequestPasswordAssignment getReaderAssignment() {
    return readerAssignment;
  }

  public void setReaderAssignment(CapturePasswordAssignmentRequestPasswordAssignment readerAssignment) {
    this.readerAssignment = readerAssignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureReaderAssignmentResponse captureReaderAssignmentResponse = (CaptureReaderAssignmentResponse) o;
    return Objects.equals(this.readerAssignment, captureReaderAssignmentResponse.readerAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readerAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptureReaderAssignmentResponse {\n");
    
    sb.append("    readerAssignment: ").append(toIndentedString(readerAssignment)).append("\n");
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

