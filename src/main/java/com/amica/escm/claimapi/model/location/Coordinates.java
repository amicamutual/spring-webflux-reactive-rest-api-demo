package com.amica.escm.claimapi.model.location;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Coordinates extends BaseModel {
    
    private static final long serialVersionUID = -8023116940317110970L;
    
    private Latitude latitude;
    private Longitude longitude;
}
