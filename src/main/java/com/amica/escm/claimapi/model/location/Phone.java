package com.amica.escm.claimapi.model.location;

import javax.validation.constraints.NotNull;

import com.amica.acm.validator.constraints.SafeHtml;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Phone extends ContactPoint {

    private static final long serialVersionUID = 1631971103700981816L;

    @SafeHtml
    private String extension;
    @SafeHtml
    private String relatedDeviceType;

    @NotNull
    private Boolean international;
    @SafeHtml
    private String areaCode;
    @SafeHtml
    private String exchange;
    @SafeHtml
    private String number;

}
