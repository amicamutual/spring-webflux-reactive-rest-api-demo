package com.amica.escm.claimapi.model.contact;

import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.TypeCode;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ClaimContactRole extends BaseModel {

    private static final long serialVersionUID = 7700024078015793263L;

    private TypeCode role;
    private TypeCode coveredPartyType;

}
