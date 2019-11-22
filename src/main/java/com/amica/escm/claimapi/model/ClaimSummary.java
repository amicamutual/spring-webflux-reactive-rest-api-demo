package com.amica.escm.claimapi.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amica.escm.claimapi.model.location.PostalAddress;
import com.amica.escm.claimapi.model.policy.Policy;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ClaimSummary extends BaseModel {
    
    private static final long serialVersionUID = -3832504240354479455L;
    
    @NotEmpty
    private String publicId;
    private String fileNumber;
    
    @NotNull
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar createDate;
    
    @NotNull
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar lossDate;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar closedDate;
    
    private TypeCode lossType;
    private TypeCode descriptionSummary;
    private String descriptionDetails;

    private TypeCode claimStatus;
    private TypeCode lineOfBusinessCode;
}
