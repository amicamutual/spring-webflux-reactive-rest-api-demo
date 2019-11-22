package com.amica.escm.claimapi.model;

import com.amica.escm.claimapi.model.location.Location;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SearchClaimsServiceProviderRequest extends BaseModel {
    
    private static final long serialVersionUID = 1038971033154383195L;
    
    private Filters filters;
    private String serviceProviderName;
    private Location location;
}
