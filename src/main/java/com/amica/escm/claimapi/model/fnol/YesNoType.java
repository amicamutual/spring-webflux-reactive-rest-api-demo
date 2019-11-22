package com.amica.escm.claimapi.model.fnol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "YesNo")
@XmlEnum
public enum YesNoType {

    //@formatter:off
    
    @XmlEnumValue("Yes")
    YES("Yes"),
    
    @XmlEnumValue("No")
    NO("No"),
    
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    
    //@formatter:off

    private String value;

    private YesNoType(String value) {
        this.value = value;
    }

    public String displayValue() {
        return value;
    }

    public static YesNoType fromValue(String v) {
        for (YesNoType c : YesNoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
    public static YesNoType fromBoolean(Boolean v) {
        if(v == Boolean.TRUE) {
            return YES;
        }
        return NO;
    }

}
