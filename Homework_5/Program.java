package Homework_5;


import java.util.Date;

import Homework_5.models.TableModel;
import Homework_5.presenters.BookingPresenter;
import Homework_5.views.BookingView;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  Метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 103, "Станислав");
        bookingView.changeReservationTable(9001, new Date(), 103, "Николай");

        //bookingView.changeReservationTable();
    }

}
