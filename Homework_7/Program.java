package Homework_7;

import Homework_7.Vacancy.VacancyType;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

       JobAgency jobAgency = new JobAgency();

    Observer student1 = new JobSeeker("A");
    Observer student2 = new JobSeeker("B");
    Observer student3 = new JobSeeker("C");

    jobAgency.registerObserver(student1);
    jobAgency.registerObserver(student2);
    jobAgency.registerObserver(student3);

    Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
    Company google = new Company("Google", 100000, jobAgency);
    Company yandex = new Company("Yandex", 120000, jobAgency);

    for (int i = 0; i < 5; i++) {
        geekBrains.needEmployee(VacancyType.FULL_TIME);
        google.needEmployee(VacancyType.PART_TIME);
        yandex.needEmployee(VacancyType.REMOTE);
    }


    }

}
