package com.amica.escm.claimapi.model;

import com.amica.escm.claimapi.model.contact.Contact;
import com.amica.v3.party.AdditionalInterestRoleTypeList;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AdditionalInterestRole extends BaseModel {

    private static final long serialVersionUID = -4074414044111309582L;
    
    private Contact contact;
    private AdditionalInterestRoleTypeList type;

}
