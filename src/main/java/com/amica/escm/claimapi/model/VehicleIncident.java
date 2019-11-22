package com.amica.escm.claimapi.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class VehicleIncident extends Incident {
    
    private static final long serialVersionUID = 3962729620667763703L;
    
    private Boolean rollOver;
    private BigDecimal lossEstimate;
    private Boolean airBagsDeployed;
    private Boolean permissionToMove;
    private Boolean operable;
    private Boolean totalLoss;
    private Boolean parked;
    private Boolean towed;
    private BigDecimal towingAmount;
    private String collisionPoint;
    private Vehicle vehicle;
    private Vessel vessel;
    private TypeCode lossParty;
    private TypeCode recoveredDescription;
    private TypeCode severityOfTheft;
    private TypeCode vehicleType;
    private Boolean drivenWithOwnersPermission;
    private TypeCode driverRelationshipToOwner;
    private Boolean estimateRequested;
    @Setter(AccessLevel.PRIVATE)
    Collection<GlassDamage> glassDamages = new ArrayList<>();
    private TypeCode glassServiceType;
    private TypeCode glassRepairType;
    private String nonGlassDamage;
    private String glassVoidReasonCode;
    
}
