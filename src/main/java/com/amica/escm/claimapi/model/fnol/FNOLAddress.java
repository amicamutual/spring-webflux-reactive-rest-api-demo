package com.amica.escm.claimapi.model.fnol;

import com.amica.acm.validator.constraints.SafeHtml;
import com.amica.escm.claimapi.model.location.PostalAddress;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class FNOLAddress extends PostalAddress {

    private static final long serialVersionUID = 4585273128734998332L;

    @SafeHtml
    private String internationalAddress;

}
