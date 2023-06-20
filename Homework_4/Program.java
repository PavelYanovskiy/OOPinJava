package Homework_4;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>(); // коробка с яблоками
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());

        Box<Orange> orangeBox1 = new Box<>(); // коробка с апельсинами
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        Box<Apple> appleBox2 = new Box<>(); //вторая коробка для яблок
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());

        System.out.println("Вес коробки1 с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Вес коробки2 с яблоками: " + appleBox2.getWeight());

        System.out.println("Равенство коробки1 с яблоками с коробкой с апельсинами: " + appleBox1.compare(orangeBox1));
        System.out.println("Равенство коробок с яблоками 1 и 2: " + appleBox1.compare(appleBox2));

        appleBox1.transfer(appleBox2);

        System.out.println("Вес коробки1 с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки2 с яблоками: " + appleBox2.getWeight());

    }



    }

