package ru.geekbrains.homeworks;

public class Cat {
    private String name;
    private Integer appetite;
    private Boolean satiety;

    public Cat(String name, Integer appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        this.satiety = plate.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAppetite() {
        return appetite;
    }

    public void setAppetite(Integer appetite) {
        this.appetite = appetite;
    }

    public Boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
