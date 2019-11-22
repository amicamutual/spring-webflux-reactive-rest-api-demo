package com.amica.escm.claimapi.model.fnol;

import java.util.Collection;
import java.util.LinkedHashSet;

import javax.validation.Valid;

import com.amica.acm.validator.constraints.SafeHtml;
import com.amica.acm.validator.constraints.SafeHtmlCollection;
import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.Vehicle;
import com.amica.escm.claimapi.model.policy.PolicyVehicle;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AutoDetails extends BaseModel {

    private static final long serialVersionUID = 9218525922691906234L;

    @Valid
    private PolicyVehicle policyVehicle;
    @Valid
    private Vehicle otherVehicle;
    private VehicleType otherVehicleType;
    @Valid
    private FNOLContact vehicleOwner;
    @Valid
    private FNOLContact vehicleDriver;
    private AutoFirstNoticeOfLossType type;
    private YesNoType vehicleDamaged;
    @SafeHtml
    private String accidentType;
    @SafeHtmlCollection
    @Setter(AccessLevel.PRIVATE)
    private Collection<String> damageLocations = new LinkedHashSet<>();
    @SafeHtml
    private String otherDamageLocation;
    private Boolean vehicleDrivable;
    private Boolean repairEstimateObtained;
    private Boolean parked;
    private Boolean vehicleLocationKnown;
    @SafeHtml
    private String vehicleLocation;
    private Boolean vehicleRecovered;
    @SafeHtml
    private String towAmount;
    private YesNoType injuriesOccurred;
    @SafeHtml
    private String injuryDetails;

}
