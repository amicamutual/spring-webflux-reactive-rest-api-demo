package com.amica.escm.claimapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Group extends BaseModel {

    private static final long serialVersionUID = -7804813370562696720L;
    
    private TypeCode branch;

}
