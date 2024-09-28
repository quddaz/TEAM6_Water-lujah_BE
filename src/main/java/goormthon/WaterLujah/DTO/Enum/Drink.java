package goormthon.WaterLujah.DTO.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Drink {
    WATER(1.0),
    COFFEE(0.65),
    TEA(0.95),
    SPARKLING_WATER(0.85),
    JUICE(0.9),
    MILK(0.85);

    private final double absorptionRate;
}
