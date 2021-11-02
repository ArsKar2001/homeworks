package ru.geekbrains.homeworks.animals;

public class Cat extends Animal {

    @Override
    public void run(double width) {
        if (width > 200) {
            System.out.println("Кот не может пробежать больше 200 метров :(");
        } else {
            System.out.println("Кот пробежал " + width + " метров");
        }
    }

    @Override
    public void swim(double width) {
        System.out.println("Кот не умеет плавать");
    }
}
