package com.amica.escm.claimapi.model.policy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.amica.escm.claimapi.model.View;
import com.amica.escm.claimapi.model.contact.Contact;
import com.amica.v3.policy.LineOfBusinessList;
import com.amica.v3.policy.PolicyStatusList;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Policy extends PolicySummary {

    private static final long serialVersionUID = -1498744950021599881L;

    private LineOfBusinessList lineOfBusiness;
    @NotNull
    private PolicyStatusList status;
    @NotNull
    private String rateState;
    private Boolean commercial;
    @JsonView(View.Enterprise.class)
    private Boolean assignedRisk;
    private Integer lobFirstInsuredYear;
    private Boolean dividend;
    @Setter(AccessLevel.PRIVATE)
    private List<String> mailingAddressLines = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    private Collection<Contact> owners = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    private Collection<Coverage> coverages = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    private Collection<Endorsement> endorsements = new ArrayList<>();

}
