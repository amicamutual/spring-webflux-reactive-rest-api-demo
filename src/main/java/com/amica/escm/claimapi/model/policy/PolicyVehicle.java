package com.amica.escm.claimapi.model.policy;

import javax.validation.constraints.NotNull;

import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.Vehicle;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PolicyVehicle extends BaseModel {

    private static final long serialVersionUID = 6097535832889031737L;
    
    @NotNull
    private Integer vehicleNumber;
    private Vehicle vehicle;

}
