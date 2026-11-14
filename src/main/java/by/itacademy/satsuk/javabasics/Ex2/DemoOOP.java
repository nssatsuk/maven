package by.itacademy.satsuk.javabasics.Ex2;

public class DemoOOP {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Bob");
        person1.setGrant(100);
        person1.setSalary(150);

        person2.setName("John");
        person2.setGrant(200);
        person2.setSalary(150);

        person1.print();
        person2.print();


    }
}
