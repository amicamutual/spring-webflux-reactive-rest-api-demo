package com.amica.escm.claimapi.model.location;

import com.amica.acm.validator.constraints.SafeHtml;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PostalAddress extends ContactPoint {

    private static final long serialVersionUID = 5607887598630236193L;

    @SafeHtml
    private String streetAddress;
    @SafeHtml
    private String streetAddress2;
    @SafeHtml
    private String city;
    @SafeHtml
    private String state;
    @SafeHtml
    private String zipCode;
    @SafeHtml
    private String county;
    @SafeHtml
    private String country;

}
