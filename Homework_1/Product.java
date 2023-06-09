package Homework_1;

public class Product {

    private static double inputCalories;
    protected String name; // Наименование
    protected String brand; // Бренд
    protected double price; // Цена
    protected double calories; // Калории 

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public Product()
    {
        this("name","brand", 100, 554);
    }

    public Product(String inputName, double inputPrice)
    {
        this("noname", inputName, inputPrice, inputCalories);
    }

    public Product(String name, String brand, double price, double calories)
    {
        if (brand == null || brand.length() < 4){
            this.brand = "noname";
        }
        else {

            this.brand = brand;
        }
        if (name == null || name.length() < 4){
            this.name = "product";
        }
        else {
            this.name = name;
        }
        checkPrice(price);
    }

    private void checkPrice(double price){
        if (price <= 0){
            this.price = 100;
        }
        else {
            this.price = price;
        }
    }


    public String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price, calories);
    }


}
