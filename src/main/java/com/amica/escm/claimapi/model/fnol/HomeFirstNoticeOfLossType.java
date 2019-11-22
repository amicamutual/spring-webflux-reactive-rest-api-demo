package com.amica.escm.claimapi.model.fnol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "type")
@XmlEnum
public enum HomeFirstNoticeOfLossType {

    //@formatter:off
    
    @XmlEnumValue("DamagedProperty")
    DAMAGED_PROPERTY("DamagedProperty"),
    
    @XmlEnumValue("StolenProperty")
    STOLEN_PROPERTY("StolenProperty"),
    
    @XmlEnumValue("StolenAndDamagedProperty")
    STOLEN_AND_DAMAGED_PROPERTY("StolenAndDamagedProperty"),
    
    @XmlEnumValue("InjuryOrIncident")
    INJURY_OR_INCIDENT("InjuryOrIncident");
    
    //@formatter:off

    private String value;

    private HomeFirstNoticeOfLossType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static HomeFirstNoticeOfLossType fromValue(String v) {
        for (HomeFirstNoticeOfLossType c : HomeFirstNoticeOfLossType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
