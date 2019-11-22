package com.amica.escm.claimapi.model.fnol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "descriptionSummary")
@XmlEnum
public enum DescriptionSummaryType {

    //@formatter:off
    
    @XmlEnumValue("Theft")
    THEFT("Theft"),
    
    @XmlEnumValue("Tow")
    TOW("Tow"),
    
    @XmlEnumValue("Glass")
    GLASS("Glass"),
    
    @XmlEnumValue("CollisionVehicle")
    COLLISION_VEHICLE("CollisionVehicle"),
    
    @XmlEnumValue("CollisionObject")
    COLLISION_OBJECT("CollisionObject"),
    
    @XmlEnumValue("CollisionPedestrian")
    COLLISION_PEDESTRIAN("CollisionPedestrian"),
    
    @XmlEnumValue("Fire")
    FIRE("Fire"),
    
    @XmlEnumValue("Vandalism")
    VANDALISM("Vandalism"),
    
    @XmlEnumValue("ImpactWithAnimal")
    IMPACT_WITH_ANIMAL("ImpactWithAnimal"),
    
    @XmlEnumValue("WeatherRelated")
    WEATHER_RELATED("WeatherRelated"),
    
    @XmlEnumValue("Earthquake")
    EARTHQUAKE("Earthquake"),
    
    @XmlEnumValue("Other")
    OTHER("Other"),
    
    @XmlEnumValue("PropertyDamage")
    PROPERTY_DAMAGE("PropertyDamage"),
    
    @XmlEnumValue("StolenProperty")
    STOLEN_PROPERTY("StolenProperty"),
    
    @XmlEnumValue("StolenPropertyAndDamage")
    STOLEN_PROPERTY_AND_DAMAGE("StolenPropertyAndDamage"),
    
    @XmlEnumValue("Injury")
    INJURY("Injury"),
    
    @XmlEnumValue("Hail")
    HAIL("Hail"),
    
    @XmlEnumValue("Lightning")
    LIGHTNING("Lightning"),
    
    @XmlEnumValue("SnowOrIce")
    SNOW_OR_ICE("SnowOrIce"),
    
    @XmlEnumValue("WindOrRainDamage")
    WIND_OR_RAIN_DAMAGE("WindOrRainDamage"),
    
    @XmlEnumValue("WaterDamage")
    WATER_DAMAGE("WaterDamage"),
    
    @XmlEnumValue("Wildfire")
    WILDFIRE("Wildfire"),
    
    @XmlEnumValue("SmokeOrSoot")
    SMOKE_OR_SOOT("SmokeOrSoot"),
    
    @XmlEnumValue("WaterPlumbing")
    WATER_PLUMBING("WaterPlumbing"),
    
    @XmlEnumValue("WaterAppliance")
    WATER_APPLIANCE("WaterAppliance"),
    
    @XmlEnumValue("WaterSumpPump")
    WATER_SUMP_PUMP("WaterSumpPump"),
    
    @XmlEnumValue("AnimalBite")
    ANIMAL_BITE("AnimalBite"),
    
    @XmlEnumValue("SlipAndFall")
    SLIP_AND_FALL("SlipAndFall"),
    
    @XmlEnumValue("DamageAwayFromHome")
    DAMAGE_AWAY_FROM_HOME("DamageAwayFromHome"),
    
    @XmlEnumValue("DamageToAnothersProperty")
    DAMAGE_TO_ANOTHERS_PROPERTY("DamageToAnothersProperty"),
    
    @XmlEnumValue("RockFromRoad")
    ROCK_FROM_ROAD("RockFromRoad"),
    
    @XmlEnumValue("FallingFlyingObjects")
    FALLING_FLYING_OBJECTS("FallingFlyingObjects"),
    
    @XmlEnumValue("MaliciousMischiefAndVandalism")
    MALICIOUS_MISCHIEF_AND_VANDALISM("MaliciousMischiefAndVandalism");
    
    //@formatter:off

    private String value;

    private DescriptionSummaryType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static DescriptionSummaryType fromValue(String v) {
        for (DescriptionSummaryType c : DescriptionSummaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
