package com.amica.escm.claimapi.model.policy;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Limit extends BaseModel {

    private static final long serialVersionUID = 133392564464109074L;

    private String type;
    private String amount;
    private String percent;

}
