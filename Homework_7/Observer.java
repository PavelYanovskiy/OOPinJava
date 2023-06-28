package Homework_7;

public interface Observer {

    void receiveOffer(String nameCompany, double salary);

    void update(Object companyName, Object salary);
}
