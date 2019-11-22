package com.amica.escm.claimapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class GlassDamage extends BaseModel {

    private static final long serialVersionUID = -8948860725753487116L;
    
    private String comments;
    private TypeCode location;

}
