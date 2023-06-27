package Homework_6;

public class Program {
   public static void main(String[] args) {
    System.out.println("Введите заказ:");
    OrderInput input = new OrderInput();
    Order order = input.getOrder();
    OrderJsonWriter writer = new OrderJsonWriter();
    writer.saveToJson(order);
    }   

}
