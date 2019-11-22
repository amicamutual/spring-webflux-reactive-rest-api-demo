package com.amica.escm.claimapi.model.fnol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "type")
@XmlEnum
public enum AutoFirstNoticeOfLossType {

    //@formatter:off
    
    @XmlEnumValue("Damage")
    DAMAGE("Damage"),
    
    @XmlEnumValue("Glass")
    GLASS("Glass"),
    
    @XmlEnumValue("Tow")
    TOW("Tow"),
    
    @XmlEnumValue("Theft")
    THEFT("Theft");
    
    //@formatter:off

    private String value;

    private AutoFirstNoticeOfLossType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static AutoFirstNoticeOfLossType fromValue(String v) {
        for (AutoFirstNoticeOfLossType c : AutoFirstNoticeOfLossType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
