package ch.rohner.peter.daotodto.models;

import java.time.LocalDate;
import java.util.List;

public record CarDTO(
        Integer id,
        String model,
        String colour,
        Integer power,
        LocalDate created,
        CarType type,
        List<String> extras
) {
}
