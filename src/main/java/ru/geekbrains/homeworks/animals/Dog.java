package ru.geekbrains.homeworks.animals;

public class Dog extends Animal {
    @Override
    public void run(double width) {
        if (width > 500) {
            System.out.println("Песик не может пробежать больше 500 метров :(");
        } else {
            System.out.println("Песик пробежал " + width + " метров");
        }
    }

    @Override
    public void swim(double width) {
        if (width > 10) {
            System.out.println("Песик не может проплять больше 10 метров :(");
        } else {
            System.out.println("Песик проплыл " + width + " метров");
        }
    }
}
