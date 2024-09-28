package goormthon.WaterLujah.service;

import goormthon.WaterLujah.DTO.Enum.Drink;
import goormthon.WaterLujah.DTO.Enum.Gender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ApiService {

    public long calculateWaterIntake(Gender gender, Boolean isOld, double weight) {
        return (long) ((gender == Gender.MALE ? weight * 35 : weight * 30)
            * (isOld ? 0.9 : 1.0));
    }
    public double getCalWater(Drink drink, double total){
        return drink.getAbsorptionRate() * total;
    }
}
