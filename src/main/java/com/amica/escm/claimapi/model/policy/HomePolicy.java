package com.amica.escm.claimapi.model.policy;

import java.util.ArrayList;
import java.util.Collection;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class HomePolicy extends Policy {

    private static final long serialVersionUID = -1121221117785191734L;

    private String formType;
    private boolean flood;
    @Setter(AccessLevel.PRIVATE)
    private Collection<Mortgagee> mortgagees = new ArrayList<>();

}
