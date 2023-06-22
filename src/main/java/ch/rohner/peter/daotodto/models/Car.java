package ch.rohner.peter.daotodto.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private String colour;
    private Integer power;
    private LocalDate created;
    private CarType type;
    private List<String> extras;
    private float priceNew;
    private float priceNow;

    public Car(int id, String model, String colour, Integer power, LocalDate created, CarType type, List<String> extras, float priceNew, float priceNow) {
        this.id = id;
        this.model = model;
        this.colour = colour;
        this.power = power;
        this.created = created;
        this.type = type;
        this.extras = extras;
        this.priceNew = priceNew;
        this.priceNow = priceNow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    public float getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(float priceNew) {
        this.priceNew = priceNew;
    }

    public float getPriceNow() {
        return priceNow;
    }

    public void setPriceNow(float priceNow) {
        this.priceNow = priceNow;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", power=" + power +
                ", created=" + created +
                ", type=" + type +
                ", extras=" + extras +
                ", priceNew=" + priceNew +
                ", priceNow=" + priceNow +
                '}';
    }
}
