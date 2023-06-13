package Homework_2;

public class Plate {
    private int food;
    
    public Plate(int food) {
        this.food = food;
    }
    
    public void info() {
        System.out.println("В миске: " + food + " еды");
    }
    //этим методом мы уменьшаем количество еды на заданное значение
    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }
    //этим методом мы увеличиваем количество еды в миске на заданное значение
    public void increaseFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return 0;
    }

}
