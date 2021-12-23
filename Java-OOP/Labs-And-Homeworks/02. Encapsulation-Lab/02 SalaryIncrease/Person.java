package SalaryIncrease_2;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        if(age < 30){
            bonus /= 2;
        }
        salary = salary + (salary * (bonus / 100));
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", firstName, lastName, salary);
    }
}