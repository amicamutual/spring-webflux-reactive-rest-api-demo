package com.amica.escm.claimapi.model.contact;

public enum PartySubtype {

    //@formatter:off
    
    INDIVIDUAL("Individual"),
    
    COMPANY("Company");
    
    //@formatter:off

    private final String value;

    private PartySubtype(String value) {
        this.value = value;
    }

    public String displayValue() {
        return value;
    }

    public static PartySubtype fromValue(String v) {
        for (PartySubtype c : PartySubtype.values()) {
            if (c.value.equalsIgnoreCase(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
