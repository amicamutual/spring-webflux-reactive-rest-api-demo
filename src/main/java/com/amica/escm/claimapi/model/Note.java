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
public class Note extends BaseModel {
    
    private static final long serialVersionUID = -1341018333173604091L;
    
    private String body;
    private String subject;
    private TypeCode topic;
    private TypeCode securityType;
    private String author;
    @NotNull
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar authoringDate;
    private Boolean confidential;
}
