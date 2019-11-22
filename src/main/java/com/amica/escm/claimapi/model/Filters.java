package com.amica.escm.claimapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Filters extends BaseModel {
    
    private static final long serialVersionUID = -5433675918018548749L;
    
    private double milesRadius;
    private double numberOfNearestProviders;
    private String serviceProviderType;
    private Boolean excludeInactiveProviders;
}
