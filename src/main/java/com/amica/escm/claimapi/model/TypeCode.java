package com.amica.escm.claimapi.model;

import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TypeCode extends BaseModel {
    
    private static final long serialVersionUID = -8023116940317110970L;
    
    @NotEmpty
    private String code;
    private String name;
    private String description;
    private Boolean retired;
}
