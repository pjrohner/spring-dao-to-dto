package ch.rohner.peter.daotodto.controllers;

import ch.rohner.peter.daotodto.models.CarDTO;
import ch.rohner.peter.daotodto.services.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public ResponseEntity<List<CarDTO>> findAll() {
        return ResponseEntity.ok(carService.findAll());
    }
}
