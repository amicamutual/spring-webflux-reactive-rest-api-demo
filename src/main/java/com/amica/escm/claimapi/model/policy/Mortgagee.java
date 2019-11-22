package com.amica.escm.claimapi.model.policy;

import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.View;
import com.amica.escm.claimapi.model.contact.Company;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Mortgagee extends BaseModel {

    private static final long serialVersionUID = -912800196381158431L;

    private Company company;
    
    @JsonView(View.Enterprise.class)
    private String loanNumber;
    
    
}
