package com.amica.escm.claimapi.model.location;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Email extends ContactPoint {

    private static final long serialVersionUID = 4047978632652388120L;
    
    @javax.validation.constraints.Email
    private String email;

}
