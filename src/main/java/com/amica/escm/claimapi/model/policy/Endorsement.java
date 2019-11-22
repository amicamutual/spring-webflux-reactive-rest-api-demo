package com.amica.escm.claimapi.model.policy;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Endorsement extends BaseModel {
    
    private static final long serialVersionUID = -1715866091337126242L;
    
    private String endorsementId;
    private String description;

}
