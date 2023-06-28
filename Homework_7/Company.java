package Homework_7;

import Homework_7.Vacancy.VacancyType;

public class Company {

    private String name;
    private JobAgency jobAgency;

    public Company(String name, int salary, JobAgency jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyType vacancyType) {
        Vacancy vacancy = new Vacancy(name, vacancyType);
        jobAgency.notifyObservers(vacancy);
    }


}
