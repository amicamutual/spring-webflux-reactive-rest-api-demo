package com.amica.escm.claimapi.model.location;

import com.amica.escm.claimapi.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Location extends BaseModel {

    private static final long serialVersionUID = 8445023294797839325L;
    
    private Coordinates coordinates;
    private PostalAddress address;
}
