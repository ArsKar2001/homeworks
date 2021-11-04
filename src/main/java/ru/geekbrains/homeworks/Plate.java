package ru.geekbrains.homeworks;

public class Plate {
    private Integer foodCount;

    public Plate(Integer foodCount) {
        this.foodCount = foodCount;
    }

    public Integer getFoodCount() {
        return foodCount;
    }

    public boolean decreaseFood(Integer appetite) {
        if (appetite <= this.foodCount) {
            this.foodCount -= appetite;
            return true;
        }
        return false;
    }

    public void addFoodCount(int foodCount) {
        if (foodCount > this.foodCount) {
            this.foodCount += foodCount;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }
}
