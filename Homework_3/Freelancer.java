package Homework_3;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */
public class Freelancer {
    private String name;
    private String email;
    private String[] skills;
    private double hourlyRate;

    public Freelancer(String name, String email, String[] skills2, double hourlyRate) {
        this.name = name;
        this.email = email;
        this.skills = skills2;
        this.hourlyRate = hourlyRate;
    }

    public Freelancer(String name2, String email2, int hoursWorked, double hourlyRate2) {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String[] getSkills() {
        return skills;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculatePayment(int hours) {
        return hours * hourlyRate;
    }



}
