package ru.geekbrains.homeworks.animals;

public abstract class Animal {
    public static int count;

    public Animal() {
        count++;
    }

    public abstract void run(double width);
    public abstract void swim(double width);
}
