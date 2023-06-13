package Homework_2;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry; //добавляем поле boolean isHungry, которое будет отвечать за сытость кота.
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }
    //В методе eat() мы проверяем, достаточно ли еды,чтобы кот покушал. 
    //Если да, то мы уменьшаем количество еды в тарелке на значение аппетита кота и 
    //устанавливаем значение isHungry в false.

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            isHungry = false;
            
        } 
    }
    
    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

}
