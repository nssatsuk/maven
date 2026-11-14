package by.itacademy.satsuk.javabasics.oop.car;

public class Car {
    private String brand;
    private String model;
    private int yearOfManufacture;
    private String color;
    private String registrationNumber;
    private String price;

    public Car(String brand, String model, int yearOfManufacture, String color, String registrationNumber, String price) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", color='" + color + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getPrice() {
        return price;
    }
}

