package Homework_5.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter = 100; //нумерацию столиков начинаем со 100

    private final Collection<Reservation> reservations = new ArrayList<>();
    private final int no;

    {
        no = ++counter;
    }

    public int getNo() { //плучаем номер столика
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() { //метод переопределения чтобы номер столика отображать
        return String.format("Столик #%d", no);
    }
}
