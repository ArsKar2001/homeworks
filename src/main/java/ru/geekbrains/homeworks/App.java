package ru.geekbrains.homeworks;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
            new Cat("cat1", 20),
            new Cat("cat2", 40),
            new Cat("cat3", 15),
            new Cat("cat4", 60),
            new Cat("cat5", 25),
        };
        Plate plate = new Plate(125);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        plate.addFoodCount(50);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
    }
}
