package com.amica.escm.claimapi.model.location;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Latitude extends GeographicDirection {
    
    private static final long serialVersionUID = 3634630351942803782L;

    private String direction;
}
