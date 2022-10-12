package com.ibm.dip.model.issueddeviceadministration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issueddeviceadministration.InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation;
import com.ibm.dip.model.issueddeviceadministration.UpdateReaderAssignmentRequestReaderAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateReaderAssignmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:47:57.112Z[GMT]")

public class UpdateReaderAssignmentRequest   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("ReaderAssignment")
  private UpdateReaderAssignmentRequestReaderAssignment readerAssignment;

  public UpdateReaderAssignmentRequest issuedDeviceAllocation(InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
    return this;
  }

  /**
   * Get issuedDeviceAllocation
   * @return issuedDeviceAllocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation getIssuedDeviceAllocation() {
    return issuedDeviceAllocation;
  }

  public void setIssuedDeviceAllocation(InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation) {
    this.issuedDeviceAllocation = issuedDeviceAllocation;
  }

  public UpdateReaderAssignmentRequest readerAssignment(UpdateReaderAssignmentRequestReaderAssignment readerAssignment) {
    this.readerAssignment = readerAssignment;
    return this;
  }

  /**
   * Get readerAssignment
   * @return readerAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateReaderAssignmentRequestReaderAssignment getReaderAssignment() {
    return readerAssignment;
  }

  public void setReaderAssignment(UpdateReaderAssignmentRequestReaderAssignment readerAssignment) {
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
    UpdateReaderAssignmentRequest updateReaderAssignmentRequest = (UpdateReaderAssignmentRequest) o;
    return Objects.equals(this.issuedDeviceAllocation, updateReaderAssignmentRequest.issuedDeviceAllocation) &&
        Objects.equals(this.readerAssignment, updateReaderAssignmentRequest.readerAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, readerAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReaderAssignmentRequest {\n");
    
    sb.append("    issuedDeviceAllocation: ").append(toIndentedString(issuedDeviceAllocation)).append("\n");
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

