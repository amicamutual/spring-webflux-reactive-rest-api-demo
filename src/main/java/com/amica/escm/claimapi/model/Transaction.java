package com.amica.escm.claimapi.model;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amica.escm.claimapi.model.contact.Contact;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Transaction extends BaseModel {

    private static final long serialVersionUID = -6037740432196072407L;
    
    private TypeCode status;
    private TypeCode costType;
    private TypeCode subType;
    private String payee;
    private String classification;
    private BigDecimal amount;
    private BigDecimal grossAmount;
    private BigDecimal insuredsDeductible;
    private Boolean deductibleWaived;
    private Boolean deductibleReduction;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar dateIssued;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar createDate;
    private Contact checkPayer;

}
