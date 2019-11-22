package com.amica.escm.claimapi.model.contact;

import javax.validation.constraints.NotEmpty;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amica.escm.claimapi.model.View;
import com.amica.v3.party.GenderList;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, exclude = { "licenseNumber", "socialSecurityNumber" })
public class Individual extends Contact {

    private static final long serialVersionUID = -3400999575664739932L;

    private String title;
    private String firstName;
    @NotEmpty
    private String lastName;
    private String middleName;
    private String suffix;
    private String designation;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonView(View.Enterprise.class)
    private XMLGregorianCalendar dateOfBirth;
    private GenderList gender;
    @JsonView(View.Enterprise.class)
    private String maritalStatus;

    @JsonView(View.Enterprise.class)
    private String licenseNumber;
    private String licenseState;
    private String licenseCountry;

    @JsonView(View.Enterprise.class)
    private String socialSecurityNumber;

}