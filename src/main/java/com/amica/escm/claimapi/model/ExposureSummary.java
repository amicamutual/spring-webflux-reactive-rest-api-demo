package com.amica.escm.claimapi.model;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amica.escm.claimapi.model.contact.Contact;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ExposureSummary extends FlaggableObject {
    
    private static final long serialVersionUID = 4108492102313829662L;
    
    @NotNull
    private Integer exposureId;
    private TypeCode type;
    private BigDecimal paymentAmount;
    private TypeCode lossParty;
    private TypeCode assignmentStatus;
    private AssignedUser assignedUser;
    private TypeCode exposureStatus;
    private TypeCode coverageSubType;
    private TypeCode primaryCoverage;
    private Contact claimant;
    private TypeCode coveragePeril;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar closedDate;
}
