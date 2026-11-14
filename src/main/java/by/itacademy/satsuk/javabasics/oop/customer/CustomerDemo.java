package by.itacademy.satsuk.javabasics.oop.customer;

import net.datafaker.Faker;

public class CustomerDemo {
    public static void main(String[] args) {

        Faker faker = new Faker();
        Custmer customer = new Custmer(
                faker.number().numberBetween(1, 4000),
                faker.name().lastName(),
                faker.name().firstName(),
                faker.name().firstName(),
                faker.address().fullAddress(),
                faker.finance().creditCard(),
                faker.finance().iban()
        );

        System.out.println(customer);

        Custmer customer2 = new Custmer(
                faker.number().numberBetween(1, 4000),
                faker.name().lastName(),
                faker.name().firstName(),
                faker.name().firstName(),
                faker.address().fullAddress(),
                faker.finance().creditCard(),
                faker.finance().iban()
        );

        System.out.println(customer2);
    }
}
