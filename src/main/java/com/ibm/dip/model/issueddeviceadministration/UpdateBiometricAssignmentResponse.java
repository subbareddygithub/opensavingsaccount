package com.ibm.dip.model.issueddeviceadministration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.issueddeviceadministration.InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation;
import com.ibm.dip.model.issueddeviceadministration.UpdateBiometricAssignmentRequestBiometricAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateBiometricAssignmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-12T12:47:57.112Z[GMT]")

public class UpdateBiometricAssignmentResponse   {
  @JsonProperty("IssuedDeviceAllocation")
  private InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation;

  @JsonProperty("BiometricAssignment")
  private UpdateBiometricAssignmentRequestBiometricAssignment biometricAssignment;

  public UpdateBiometricAssignmentResponse issuedDeviceAllocation(InitiateIssuedDeviceAllocationRequestIssuedDeviceAllocation issuedDeviceAllocation) {
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

  public UpdateBiometricAssignmentResponse biometricAssignment(UpdateBiometricAssignmentRequestBiometricAssignment biometricAssignment) {
    this.biometricAssignment = biometricAssignment;
    return this;
  }

  /**
   * Get biometricAssignment
   * @return biometricAssignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateBiometricAssignmentRequestBiometricAssignment getBiometricAssignment() {
    return biometricAssignment;
  }

  public void setBiometricAssignment(UpdateBiometricAssignmentRequestBiometricAssignment biometricAssignment) {
    this.biometricAssignment = biometricAssignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBiometricAssignmentResponse updateBiometricAssignmentResponse = (UpdateBiometricAssignmentResponse) o;
    return Objects.equals(this.issuedDeviceAllocation, updateBiometricAssignmentResponse.issuedDeviceAllocation) &&
        Objects.equals(this.biometricAssignment, updateBiometricAssignmentResponse.biometricAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceAllocation, biometricAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBiometricAssignmentResponse {\n");
    
    sb.append("    issuedDeviceAllocation: ").append(toIndentedString(issuedDeviceAllocation)).append("\n");
    sb.append("    biometricAssignment: ").append(toIndentedString(biometricAssignment)).append("\n");
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

