package Homework_1;

import java.util.ArrayList;
import java.util.List;

public class Programma {

    public static void main(String[] args) {

//объявляем переменную типа продукт:создаем новый объект при этом переменная продукт1 указывает на этот объект
        Product product1 = new Product(); 
//получаем досутп к объекту продукт 1 и указывать его состояния: бренд, имя и т.д.
        product1.brand = "Milka";
        product1.name = "Milka Oreo";
        product1.price = 125.00;
        product1.calories = 554;
        System.out.println(product1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
    
        VendingMachine vendingMachine = new VendingMachine(products);
        Chocolate ChocolateResult = vendingMachine.getChocolate(1.5);
        if (ChocolateResult != null){
            System.out.println("Вы купили:");
            System.out.println(ChocolateResult.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет в автомате.");
        }
    }

}

