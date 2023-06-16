package Homework_3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return 
     * @return
     */
    // static Worker generateEmployee(){
    //     String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    //     String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
    //     int salary = random.nextInt(20000, 80000);
    //     return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary);
    // }

     static Worker generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(20000, 80000);
        int type = random.nextInt(2);
        if (type == 0) {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], salary, type);
        } else {
            int hoursWorked = random.nextInt(100, 200);
            double hourlyRate = random.nextDouble(100, 200);
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], hoursWorked, hourlyRate);
        }
        }

    
    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees); // new SalaryComparator()

        for(Employee employee : employees){
            System.out.println(employee);
        }

    }
    

}

