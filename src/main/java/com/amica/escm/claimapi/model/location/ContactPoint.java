package com.amica.escm.claimapi.model.location;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ContactPoint extends BaseModel {

    private static final long serialVersionUID = -7945926732097397104L;

    private String use;
    private Boolean preferred;

}
