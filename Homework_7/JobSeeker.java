package Homework_7;

public class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Object companyName, Object salary) {
        System.out.println(name + ": Новая вакансия от компании " + companyName + " с зарплатой " + salary);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveOffer'");
    }


}

