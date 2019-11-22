package com.amica.escm.claimapi.model;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedHashSet;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amica.acm.validator.constraints.SafeHtml;
import com.amica.v3.physicalobject.VehicleConditionList;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Vehicle extends BaseModel {

    private static final long serialVersionUID = -8023116940317110970L;

    @SafeHtml
    private String year;
    @SafeHtml
    private String make;
    @SafeHtml
    private String model;
    @SafeHtml
    private String vin;
    @SafeHtml
    private String color;
    @SafeHtml
    private String style;
    @SafeHtml
    private String description;
    @SafeHtml
    private String vehicleUse;
    @Setter(AccessLevel.PRIVATE)
    private Collection<AdditionalInterestRole> additionalInterestRoles = new LinkedHashSet<>();
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private XMLGregorianCalendar purchaseDate;
    private BigDecimal actualCostAmount;
    private VehicleConditionList condition;
    @SafeHtml
    private String inspectionStatus;
    @SafeHtml
    private String registrationNumber;
    @SafeHtml
    private String registrationState;
    @SafeHtml
    private String registrationCountry;

}
