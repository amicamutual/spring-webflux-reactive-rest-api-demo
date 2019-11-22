package com.amica.escm.claimapi.model.location;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Longitude extends GeographicDirection {
    
    private static final long serialVersionUID = -8023116940317110970L;

    private String direction;
}
