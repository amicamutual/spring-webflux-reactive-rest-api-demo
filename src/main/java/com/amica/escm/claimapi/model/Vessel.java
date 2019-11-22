package com.amica.escm.claimapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Vessel extends BaseModel {

    private static final long serialVersionUID = -4202834205662154508L;
    
    private TypeCode boatType;
    private String name;
    private String size;

}
