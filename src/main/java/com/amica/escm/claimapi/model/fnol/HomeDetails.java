package com.amica.escm.claimapi.model.fnol;

import com.amica.acm.validator.constraints.SafeHtml;
import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class HomeDetails extends BaseModel {

    private static final long serialVersionUID = 2507591200976090546L;

    private HomeFirstNoticeOfLossType type;
    private Boolean weatherRelated;
    private YesNoType homeLivable;
    private Boolean needsEmergencyRepairs;
    private Boolean contractorObtained;
    @SafeHtml
    private String incidentDescription;
    private YesNoType injuriesOccurred;
    @SafeHtml
    private String injuryDetails;

}
