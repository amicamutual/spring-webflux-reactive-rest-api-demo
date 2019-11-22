package com.amica.escm.claimapi.model.fnol;

import javax.validation.Valid;

import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.location.Email;
import com.amica.escm.claimapi.model.location.Phone;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PrimaryContactInfo extends BaseModel {

    private static final long serialVersionUID = 3926342685471197830L;

    @Valid
    private FNOLAddress address;
    @Valid
    private Phone phone;
    @Valid
    private Email email;
    private Boolean emailNotifications;
    private FirstContact firstContact;

}
