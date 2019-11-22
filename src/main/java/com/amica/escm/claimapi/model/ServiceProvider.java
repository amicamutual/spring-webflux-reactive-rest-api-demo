package com.amica.escm.claimapi.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ServiceProvider extends BaseModel {

    private static final long serialVersionUID = 2143914106653113312L;
    
    @Setter(AccessLevel.PRIVATE)
    private Collection<TypeCode> types = new ArrayList<>();;
    private BaseModel contact;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private XMLGregorianCalendar toServiceDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private XMLGregorianCalendar fromServiceDate;
    private String serviceDescription;
    private String dmvFacilityNumber;

}
