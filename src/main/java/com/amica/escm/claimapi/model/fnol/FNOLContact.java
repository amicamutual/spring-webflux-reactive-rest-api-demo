package com.amica.escm.claimapi.model.fnol;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.Valid;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amica.acm.validator.constraints.SafeHtml;
import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.location.Email;
import com.amica.escm.claimapi.model.location.Phone;
import com.amica.v3.party.GenderList;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, exclude = { "licenseNumber" })
public class FNOLContact extends BaseModel {

    private static final long serialVersionUID = -6865147010884069742L;

    // Shared fields
    private String uuid;
    @Setter(AccessLevel.PRIVATE)
    @Valid
    private Collection<FNOLAddress> addresses = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    @Valid
    private Collection<Email> emails = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    @Valid
    private Collection<Phone> phones = new ArrayList<>();

    // Fields from Individual
    @SafeHtml
    private String title;
    @SafeHtml
    private String firstName;
    @SafeHtml
    private String lastName;
    @SafeHtml
    private String middleName;
    @SafeHtml
    private String suffix;
    @SafeHtml
    private String designation;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private XMLGregorianCalendar dateOfBirth;
    private GenderList gender;
    @SafeHtml
    private String maritalStatus;
    @SafeHtml
    private String licenseNumber;
    @SafeHtml
    private String licenseState;
    @SafeHtml
    private String licenseCountry;

    // Fields from Company
    @SafeHtml
    private String name;

}
