package by.itacademy.satsuk.javabasics.oop.car;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Q5 FY", 2022, "Серый", "1234 AB-1", "89 928 руб.");
        Car car2 = new Car("BMW", "3 серия E46", 2003, "Серый", "2345 AB-2", "13 512 руб.");
        Car car3 = new Car("Chevrolet", "Equinox III", 2021, "Черный", "5555 HH-7", "53 146 руб.");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
