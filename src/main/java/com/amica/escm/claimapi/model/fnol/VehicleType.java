package com.amica.escm.claimapi.model.fnol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "vehicleType")
@XmlEnum
public enum VehicleType {

    //@formatter:off
    
    @XmlEnumValue("Listed")
    LISTED("Listed"),
    
    @XmlEnumValue("NonOwned")
    NON_OWNED("NonOwned"),
    
    @XmlEnumValue("Owned")
    OWNED("Owned"),
    
    @XmlEnumValue("Borrowed")
    BORROWED("Borrowed"),
    
    @XmlEnumValue("Rental")
    RENTAL("Rental"),
    
    @XmlEnumValue("Other")
    OTHER("Other");
    
    //@formatter:off

    private String value;

    private VehicleType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static VehicleType fromValue(String v) {
        for (VehicleType c : VehicleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
