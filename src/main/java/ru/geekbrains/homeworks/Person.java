package ru.geekbrains.homeworks;

public class Person {
    private final String fio;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final Double salary;
    private final Integer age;

    public Person(String fio, String position, String email, String phoneNumber, Double salary, Integer age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}