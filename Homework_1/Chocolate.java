package Homework_1;

public class Chocolate extends Product {

    private double price; 
    private double calories;


    public double getPrice() {
        return price;
    }

    public void setPrice(int volume) {
        this.price = volume;
    }

    public int getCalories() {
        return (int) calories;
    }

    public void setCalories(int Calories) {
        this.calories = Calories;
    }

    public Chocolate(String brand, String name, double price, double volume, int fatСontent) {
        super(brand, name, price, volume);
        this.price = volume;
        this.calories = fatСontent;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколадка] %s - %s - %f [цена: %f; калорийность: %d]", brand, name, price, price, calories);
    }

    public double getVolume() {
        return 0;
    }
}
