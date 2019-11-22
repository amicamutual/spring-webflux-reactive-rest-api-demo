package com.amica.escm.claimapi.model.fnol;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class FirstNoticeOfLossSubmissionResponse extends BaseModel {
    
    private static final long serialVersionUID = -4754580237518976999L;
    
    private String fileNumber;

}
