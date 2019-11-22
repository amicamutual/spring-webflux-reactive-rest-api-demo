package com.amica.escm.claimapi.model.document;


import javax.validation.constraints.NotEmpty;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Attachment extends BaseModel {
    
    private static final long serialVersionUID = 5687574426593478390L;
    
    @NotEmpty
    private String name;
    private String documentUID;
    private String mimeType;
}
