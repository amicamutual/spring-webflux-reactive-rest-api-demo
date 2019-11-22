package com.amica.escm.claimapi.model.document;


import javax.validation.constraints.NotEmpty;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Form extends BaseModel {
    
    private static final long serialVersionUID = 3829358695037647396L;
    
    @NotEmpty
    private String name;
}
