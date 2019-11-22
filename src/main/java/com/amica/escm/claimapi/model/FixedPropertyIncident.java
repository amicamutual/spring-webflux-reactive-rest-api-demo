package com.amica.escm.claimapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class FixedPropertyIncident extends Incident {

    private static final long serialVersionUID = 1239667220712777247L;

    private Boolean lossOfUse;
    private Boolean weatherRelated;

}
