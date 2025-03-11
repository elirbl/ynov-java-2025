package fr.ynov.java.car;

public class Vehicle {
    private String plate;
    private String brand;
    private String model;
    private VehicleType type;
    private int year;

    public Vehicle(String plate, String brand, String model, VehicleType type, int year) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.year = year;
    }

    // Getters
    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public VehicleType getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", year=" + year +
                '}';
    }
}
