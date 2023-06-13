package Homework_2;

public class MainClass {
    public static void main(String[] args) {
        
        Cat[] cats = {
            new Cat("Кузьмич", 5),
            new Cat("Том", 3),
            new Cat("Гарфилд", 7)
        };
        Plate plate = new Plate(10);
        plate.info();
        // в методе eat выводим информацию о сытости каждого кота. 
        // После этого мы добавляем еду в тарелку и выводим информацию о ней.
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Кот " + cat.getName() + " голодный: " + cat.isHungry());
        }   
        
        plate.increaseFood(10);
        plate.info();
        System.out.println("Коты могут кушать, в миске достаточно еды!");
    }

   
    }



