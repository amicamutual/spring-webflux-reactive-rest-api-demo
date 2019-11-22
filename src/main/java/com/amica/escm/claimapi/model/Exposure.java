package com.amica.escm.claimapi.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Exposure extends ExposureSummary {

    private static final long serialVersionUID = -1394700921290295101L;

    @NotNull
    private String incidentId;
    @Setter(AccessLevel.PRIVATE)
    private Collection<AppraisalRequest> appraisalRequests = new ArrayList<>();
    private String vehicleType;
    private BigDecimal salvageNet;
    @Setter(AccessLevel.PRIVATE)
    private Collection<Transaction> transactions = new ArrayList<>();
    private Boolean subrogation;

    @JsonView(View.Enterprise.class)
    @Setter(AccessLevel.PRIVATE)
    private Collection<SubrogationUpdate> subrogationUpdates = new ArrayList<>();

    private String primaryCoverageDeductibleAmount;
    private String primaryCoverageDeductiblePercent;
    private String coveragePerilDeductibleAmount;
    private String coveragePerilDeductiblePercent;
    private String hurricaneDeductibleAmount;
    private String hurricaneDeductiblePercent;
}
