package com.amica.escm.claimapi.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.format.annotation.DateTimeFormat;

import com.amica.escm.claimapi.model.contact.InvolvedParty;
import com.amica.escm.claimapi.model.document.Document;
import com.amica.escm.claimapi.model.policy.PolicyVehicle;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Claim extends ClaimSummary {

    private static final long serialVersionUID = 272146478585456326L;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private XMLGregorianCalendar chargeDate;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private XMLGregorianCalendar bookingDate;
    private TypeCode quickClaimType;
    private String excludeCode;
    private String catastropheType;
    private String catastropheCode;
    private String catastropheDescription;
    private String lossCauseSummary;
    private TypeCode closedOutcome;
    private TypeCode branchOffice;
    private Boolean suppressAllPhotos;
    private TypeCode cpSyncStatus;
    private TypeCode fileType;
    private TypeCode caAccountabilityCode;
    private TypeCode maSurchargeCode;
    private TypeCode accountabilityCode;
    private Group assignedGroup;
    private TypeCode howReported;
    private Boolean emergencyRepairs;
    private Boolean onlineGlassIndicator;
    @Setter(AccessLevel.PRIVATE)
    private Collection<String> relatedClaimFiles = new LinkedHashSet<>();
}
