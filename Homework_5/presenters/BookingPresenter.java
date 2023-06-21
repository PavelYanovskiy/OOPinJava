package Homework_5.presenters;

import java.util.Collection;
import java.util.Date;

import Homework_5.models.Table;
import Homework_5.models.TableModel;


public class BookingPresenter implements ViewObserver {

    private final View bookingView;
    private final TableModel tableModel;

    public BookingPresenter(View bookingView, TableModel tableModel){
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);
    }


    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.updateTablesView(loadTables());
    }

    private void showReservationTableResult(int reservationNo){
        bookingView.updateReservationTableResult(reservationNo);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo, name);
        showReservationTableResult(reservationNo);
    }


    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onChangeReservationTable'");
    }


    
}
