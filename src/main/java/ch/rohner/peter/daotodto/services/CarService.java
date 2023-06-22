package ch.rohner.peter.daotodto.services;

import ch.rohner.peter.daotodto.models.Car;
import ch.rohner.peter.daotodto.models.CarDTO;
import ch.rohner.peter.daotodto.models.CarToCarDtoMapper;
import ch.rohner.peter.daotodto.models.CarType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> cars = new ArrayList<>();
    private final CarToCarDtoMapper mapper;

    public CarService(CarToCarDtoMapper mapper) {
        this.mapper = mapper;
        List<String> extras = new ArrayList<>();
        extras.add("Klima");
        extras.add("Hybrid");
        extras.add("5D Sound");
        extras.add("Sport Trimming");
        this.cars.add(new Car(10, "Ford", "gold green", 200, LocalDate.now(), CarType.PW, extras, 24000, 19800));
        this.cars.add(new Car(20, "Ford", "white", 150, LocalDate.now(), CarType.VAN, extras, 18000, 15640));
        this.cars.add(new Car(30, "Audi", "black", 125, LocalDate.of(2023, 4, 1), CarType.PICKUP, extras, 23800, 16750));
    }

    public List<CarDTO> findAll() {
        return cars.stream()
                .map(mapper)
                .collect(Collectors.toList());
    }
}
