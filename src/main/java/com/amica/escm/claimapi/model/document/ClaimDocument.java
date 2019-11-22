package com.amica.escm.claimapi.model.document;


import javax.validation.constraints.NotEmpty;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ClaimDocument extends BaseModel {
    
    private static final long serialVersionUID = 1442772661532526407L;
    
    @NotEmpty
    private String claimFileNumber;
    private String exposureId;
    private Document document;
}
