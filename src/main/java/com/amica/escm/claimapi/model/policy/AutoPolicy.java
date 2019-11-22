package com.amica.escm.claimapi.model.policy;

import java.util.ArrayList;
import java.util.Collection;

import com.amica.escm.claimapi.model.Vehicle;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AutoPolicy extends Policy {

    private static final long serialVersionUID = 2534448721977018318L;

    @Setter(AccessLevel.PRIVATE)
    private Collection<Vehicle> vehicles = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    private Collection<OperatorRole> operatorRoles = new ArrayList<>();
}
