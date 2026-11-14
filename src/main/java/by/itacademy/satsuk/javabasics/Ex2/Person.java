package by.itacademy.satsuk.javabasics.Ex2;

public class Person extends Student{
    private Integer salary;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public int getIncome(){
        return super.getIncome() + (getSalary() !=null ? getSalary() : 0);
    }

    void print(){
        System.out.println(getName() + " " + getIncome());
    }
}
