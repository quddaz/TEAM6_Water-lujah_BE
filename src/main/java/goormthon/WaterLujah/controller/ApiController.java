package goormthon.WaterLujah.controller;

import goormthon.WaterLujah.DTO.WaterCalRequestDTO;
import goormthon.WaterLujah.DTO.WaterIntakeRequestDTO;
import goormthon.WaterLujah.global.baseResponse.ResponseDto;
import goormthon.WaterLujah.service.ApiService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class ApiController {
    private final ApiService apiService;

    @PostMapping("/getWaterIntake")
    public ResponseEntity<?> calculateWaterIntake(@Valid @RequestBody WaterIntakeRequestDTO requestDTO) {
        long waterIntake = apiService.calculateWaterIntake(requestDTO.getGender(), requestDTO.getIsOld(), requestDTO.getWeight());
        return ResponseEntity.ok().body(ResponseDto.of("물 총량 계산 성공", waterIntake));
    }

    @PostMapping("/getCalWater")
    public ResponseEntity<?> getCalWater(@Valid @RequestBody WaterCalRequestDTO requestDTO) {
        double water = apiService.getCalWater(requestDTO.getDrink(), requestDTO.getTotal());
        return ResponseEntity.ok().body(ResponseDto.of("물 계산 성공", water));
    }
}
