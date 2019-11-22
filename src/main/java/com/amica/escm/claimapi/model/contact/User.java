package com.amica.escm.claimapi.model.contact;

import javax.validation.constraints.NotNull;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class User extends BaseModel {

    private static final long serialVersionUID = 5211737593526790703L;
    
    @NotNull
    private String userName;
    @NotNull
    private Individual individual;
    private String jobTitle;
    private Boolean active;
    private Boolean suppressPhoto;
    private String supervisorUserName;

}
