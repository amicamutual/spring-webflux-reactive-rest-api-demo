package com.amica.escm.claimapi.model.policy;

import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.contact.Individual;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class OperatorRole extends BaseModel {

    private static final long serialVersionUID = -2432669339200711977L;
    
    private Integer sequence;
    private Boolean deferred;
    private Individual operator;

}
