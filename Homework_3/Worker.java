package Homework_3;

public class Worker extends Employee {

    public Worker(String name, String surname, double salary, double hourlyRate) {
        super(name, surname, salary);
    }

        @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, calculateSalary());
    }
}
