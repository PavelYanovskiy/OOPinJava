package Homework_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Создан новый класс Учитель и сюда включены два компратора - один сравнивает зарплату и выводит  список от большей к меньшей
//второй компаратор выводит самых оптынх и самых молодых сотрудников

public class Teacher {
    private String firstName;
    private String lastName;
    private int salary;
    private int experience;

    public Teacher(String firstName, String lastName, int salary, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Иван", "Петров", 50000, 5));
        teachers.add(new Teacher("Евгения", "Николаева", 60000, 10));
        teachers.add(new Teacher("Семенов", "Семен", 40000, 2));
        teachers.add(new Teacher("Алиса", "Михайлова", 55000, 7));
        teachers.add(new Teacher("Андрей", "Смирнов", 45000, 3));

        // компаратор для сравнения зарплаты
        Comparator<Teacher> salaryComparator = new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                return t2.getSalary() - t1.getSalary();
            }
        };

        // компаратор для сравнения опыта работы
        Comparator<Teacher> experienceComparator = new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                if (t1.getExperience() > t2.getExperience()) {
                    System.out.println("Самый опытный сотрудник: " + t1.getFirstName() + " " + t1.getLastName() + ", стаж работы: " + t1.getExperience());
                } else if (t1.getExperience() < t2.getExperience()) {
                    System.out.println("Самый молодой сотрудник: " + t1.getFirstName() + " " + t1.getLastName() + ", стаж работы: " + t1.getExperience());
                }
                return t2.getExperience() - t1.getExperience();
            }
        };

        // сортировка по зарплате
        Collections.sort(teachers, salaryComparator);
        System.out.println("Список учителей, отсортированный по зарплате:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + ", зарплата: " + teacher.getSalary());
        }

        // сортировка по опыту работы
        Collections.sort(teachers, experienceComparator);
    }
}
