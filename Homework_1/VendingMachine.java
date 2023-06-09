package Homework_1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;



    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public  Chocolate getChocolate(double volume){

        for(Product product : products){
            if (product instanceof Chocolate){
               if ( ((Chocolate)product).getVolume()  == volume){
                   return (Chocolate)product;
               }
            }
        }
        return null;
    }

}
