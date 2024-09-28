package goormthon.WaterLujah.DTO;

import goormthon.WaterLujah.DTO.Enum.Drink;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WaterCalRequestDTO {

    private Drink drink;

    @NotNull(message = "마신 양이 비어요")
    @Min(value = 30, message = "마신 양은 30ml 이상이어야 합니다.")
    private double total;
}
