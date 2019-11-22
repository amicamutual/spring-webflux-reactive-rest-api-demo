package com.amica.escm.claimapi.model;

import javax.validation.constraints.NotNull;

import com.amica.escm.claimapi.model.contact.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AssignedUser extends BaseModel {

    private static final long serialVersionUID = -1964378921474085229L;
    
    @NotNull
    private User user;
    private String type;

}
