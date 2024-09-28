package goormthon.WaterLujah.DTO;

import goormthon.WaterLujah.DTO.Enum.Gender;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WaterIntakeRequestDTO {
    private Gender gender;
    private Boolean isOld;
    @NotNull(message = "체중이 비어요")
    @Min(value = 1, message = "체중은 1kg 이상이어야 합니다.")
    private double weight;
}
