package Lesson5;

public class Employees {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "Ivanov", "Ingineer", "ivanov@mail.ru", "89511236547", 35000, 45);
        employees[1] = new Employee("Petr", "Petrov", "Ingineer", "petror@mail.ru", "89511236418", 25000, 30);
        employees[2] = new Employee("Sidor", "Sidorov", "Ingineer", "sidorov@mail.ru", "89511235283", 50000, 41);
        employees[3] = new Employee("Luda", "Ludova", "Ingineer", "ludova@mail.ru", "89511235469", 31000, 21);
        employees[4] = new Employee("Masha", "Mashkova", "Ingineer", "mashkova@mail.ru", "8951124174", 35000, 43);
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
