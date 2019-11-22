package com.amica.escm.claimapi.model;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AutoPay extends BaseModel {
    
    private static final long serialVersionUID = 6784440732474529676L;
    
    private Boolean enrolled;
    private String paymentMethodUUID;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private XMLGregorianCalendar effectiveDate;
    private Boolean eligible;
    private String frequency;
}
