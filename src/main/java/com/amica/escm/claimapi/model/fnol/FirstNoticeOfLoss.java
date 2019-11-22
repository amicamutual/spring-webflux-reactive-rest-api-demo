package com.amica.escm.claimapi.model.fnol;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amica.acm.validator.constraints.SafeHtml;
import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.policy.PolicySummary;
import com.amica.v3.policy.LineOfBusinessList;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class FirstNoticeOfLoss extends BaseModel {

    private static final long serialVersionUID = 3488654393210030084L;

    @NotEmpty
    private String id;

    @NotNull
    private Integer version;

    private String fileNumber;

    private boolean submitted;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar submissionDate;

    @NotEmpty
    private String partyUUID;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar lossDate;
    @Valid
    private FNOLAddress lossLocation;
    private LineOfBusinessList lineOfBusiness;
    private DescriptionSummaryType descriptionSummary;
    @SafeHtml
    private String descriptionSummaryFreeForm;
    private PolicySummary policy;
    @Valid
    private PrimaryContactInfo primaryContactInfo;
    @SafeHtml
    private String additionalInfo;
    @Valid
    private AutoDetails autoDetails;
    @Valid
    private HomeDetails homeDetails;

}
