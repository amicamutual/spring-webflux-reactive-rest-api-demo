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
public class ClaimsServiceProvider extends BaseModel {
    
    private static final long serialVersionUID = 281301100623066996L;
    
    private String code;
    @Setter(AccessLevel.PRIVATE)
    private Collection<String> types = new ArrayList<>();
    private TypeCode reportingType;
    private TypeCode status;
}
