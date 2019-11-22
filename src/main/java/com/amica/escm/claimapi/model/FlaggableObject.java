package com.amica.escm.claimapi.model;

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
public class FlaggableObject extends BaseModel {

    private static final long serialVersionUID = 3653097080329769070L;

    @Setter(AccessLevel.PRIVATE)
    private Collection<String> flags = new ArrayList<>();

}
