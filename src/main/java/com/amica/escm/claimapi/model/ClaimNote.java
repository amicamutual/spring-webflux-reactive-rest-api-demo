package com.amica.escm.claimapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ClaimNote extends BaseModel {

    private static final long serialVersionUID = -244631670402581016L;

    private String claimFileNumber;
    private Integer exposure;
    private Note note;
}
