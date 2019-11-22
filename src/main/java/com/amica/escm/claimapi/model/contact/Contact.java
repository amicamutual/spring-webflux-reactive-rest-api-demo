package com.amica.escm.claimapi.model.contact;

import java.util.ArrayList;
import java.util.Collection;

import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.location.Email;
import com.amica.escm.claimapi.model.location.Phone;
import com.amica.escm.claimapi.model.location.PostalAddress;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public abstract class Contact extends BaseModel {

    private static final long serialVersionUID = 8426922458046390241L;
    
    private String uuid;
    @Setter(AccessLevel.PRIVATE)
    private Collection<PostalAddress> addresses = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    private Collection<Email> emails = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    private Collection<Phone> phones = new ArrayList<>();

}
