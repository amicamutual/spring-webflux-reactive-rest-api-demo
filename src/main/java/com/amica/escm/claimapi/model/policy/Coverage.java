package com.amica.escm.claimapi.model.policy;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amica.escm.claimapi.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Coverage extends BaseModel {

    private static final long serialVersionUID = 7953521196968824532L;

    private String type;
    private String coveredObjectType;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private XMLGregorianCalendar effectiveDate;
    @Setter(AccessLevel.PRIVATE)
    private Collection<String> descriptions = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    private Collection<String> perils = new ArrayList<>();
    // Limit amounts need to be strings for split limits, ex. '20.00\600.00'

    @Setter(AccessLevel.PRIVATE)
    private Collection<Limit> limits = new ArrayList<>();
    
    //TODO remove old limit fields
    private String limitAmount;
    private String limitPercent;
    private String limitType;
    
    private String deductibleAmount;
    private String deductiblePercent;

    private Boolean deductibleWaived;
    @Setter(AccessLevel.PRIVATE)
    private Collection<Coverage> subCoverages = new ArrayList<>();

    public boolean addSubCoverage(Coverage subCoverage) {
        return subCoverages.add(subCoverage);
    }

}
