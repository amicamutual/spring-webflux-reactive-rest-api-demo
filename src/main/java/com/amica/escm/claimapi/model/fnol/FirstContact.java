package com.amica.escm.claimapi.model.fnol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "firstContact")
@XmlEnum
public enum FirstContact {

    //@formatter:off
    
    @XmlEnumValue("ASAP")
    ASAP("ASAP"),
    
    @XmlEnumValue("NextBusinessDay")
    NEXT_BUSINESS_DAY("NextBusinessDay");
    
    //@formatter:off

    private String value;

    private FirstContact(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static FirstContact fromValue(String v) {
        for (FirstContact c : FirstContact.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
