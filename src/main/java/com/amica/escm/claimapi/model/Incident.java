package com.amica.escm.claimapi.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import com.amica.escm.claimapi.model.location.PostalAddress;
import com.amica.escm.claimapi.model.policy.Coverage;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Incident extends BaseModel {
    
    private static final long serialVersionUID = 3962729620667763703L;
    
    @NotNull
    private String id;
    @Setter(AccessLevel.PRIVATE)
    private Collection<AppraisalRequest> appraisalRequests = new ArrayList<>();
    private PostalAddress location;
    private String damageDescription;
    private BigDecimal lossEstimate;
    @Setter(AccessLevel.PRIVATE)
    private Collection<Coverage> coverages = new ArrayList<>();
}
