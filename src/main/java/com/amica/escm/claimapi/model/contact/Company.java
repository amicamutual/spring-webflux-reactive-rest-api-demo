package com.amica.escm.claimapi.model.contact;


import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Company extends Contact {

    private static final long serialVersionUID = 7834578914403869211L;
    
    @NotEmpty
    private String name;

}
