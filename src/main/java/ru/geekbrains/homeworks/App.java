package ru.geekbrains.homeworks;

import ru.geekbrains.homeworks.animals.Animal;
import ru.geekbrains.homeworks.animals.Cat;
import ru.geekbrains.homeworks.animals.Dog;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        cat1.run(100);
        cat1.swim(50);

        Dog dog1 = new Dog();

        dog1.run(400);
        dog1.swim(10);

        System.out.println("Кол-во животных " + Animal.count);
    }
}
