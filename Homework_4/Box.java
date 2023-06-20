package Homework_4;

import java.util.ArrayList;

public class Box <F extends Fruit> {

    private ArrayList<F> fruits;


    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public float getWeight() { //вычисляем вес коробки
        float weight = 0.0f;
        for (F fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void add(F fruit) { //добавлям фрукт в коробку
        fruits.add(fruit);
    }

    public boolean compare(Box<?> otherBox) { //сравниваем текущую коробку с переданной в качестве параметра
        return Math.abs(getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transfer(Box<F> otherBox) { //метод пересыпания фруктов из текуей коробки в другую
        if (otherBox == this) {
            return;
        }
        for (F fruit : new ArrayList<>(fruits)) {
            otherBox.add(fruit);
            fruits.remove(fruit);
        }
    }

}
