package com.amica.escm.claimapi.model.contact;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.TypeCode;
import com.amica.escm.claimapi.model.View;
import com.amica.v3.condition.MedicalConditionTypeList;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class InvolvedParty extends BaseModel {

    private static final long serialVersionUID = -3513634945436827140L;

    @NotNull
    private Contact contact;
    private TypeCode type;

    @Setter(AccessLevel.PRIVATE)
    Collection<ClaimContactRole> roles = new ArrayList<>();

    @JsonView(View.Enterprise.class)
    private MedicalConditionTypeList medicalCondition;

    @Setter(AccessLevel.PRIVATE)
    @JsonView(View.Enterprise.class)
    private Collection<TypeCode> citations = new ArrayList<>();;

    private Boolean unableToContact;

}
