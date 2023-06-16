package Homework_3;
//В этом классе есть четыре поля: name, email, subjects и yearsOfExperience. 
//Конструктор принимает значения для каждого поля. 
//Также есть геттеры и сеттеры для каждого поля, а также метод getTeachingExperience, 
//который возвращает строку, описывающую опыт преподавания. 
//Есть также метод teach, который выводит сообщение "Обучает...
public class Teacher {
    private String name;
    private String email;
    private String[] subjects;
    private int yearsOfExperience;

    public Teacher(String name, String email, String[] subjects, int yearsOfExperience) {
        this.name = name;
        this.email = email;
        this.subjects = subjects;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getTeachingExperience() {
        if (yearsOfExperience == 1) {
            return "1 год педагогического опыта";
        } else {
            return yearsOfExperience + " лет педагогического стажа";
        }
    }

    public void teach() {
        System.out.println("Обучает...");
    }

}
