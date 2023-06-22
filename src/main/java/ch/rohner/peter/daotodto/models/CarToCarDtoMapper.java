package ch.rohner.peter.daotodto.models;

import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CarToCarDtoMapper implements Function<Car, CarDTO> {
    @Override
    public CarDTO apply(Car car) {
        return new CarDTO(car.getId(),
                car.getModel(),
                car.getColour(),
                car.getPower(),
                car.getCreated(),
                car.getType(),
                car.getExtras().stream()
                        .map(extra -> extra.toString())
                        .collect(Collectors.toList())
        );
    }
}
