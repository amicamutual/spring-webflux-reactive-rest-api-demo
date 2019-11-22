package com.amica.escm.claimapi.model.fnol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FNOLContactType")
@XmlEnum
public enum FNOLContactType {

    //@formatter:off
    
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    
    @XmlEnumValue("Company")
    COMPANY("Company");
    
    //@formatter:off

    private String value;

    private FNOLContactType(String value) {
        this.value = value;
    }

    public String displayValue() {
        return value;
    }

    public static FNOLContactType fromValue(String v) {
        for (FNOLContactType c : FNOLContactType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
