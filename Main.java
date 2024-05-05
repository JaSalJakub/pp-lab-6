import models.Manager;
import models.Worker;
import abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jim", 2500, 1, "2020-01-01", "Trader");
        Worker worker2 = new Worker("Dwight", 2200, 2, "2019-05-15", "Trader");
        Worker worker3 = new Worker("Pamela", 1800, 3, "2021-03-10", "Receptionist");
        Worker worker4 = new Worker("Andy", 2000, 4, "2018-11-20", "Trader");

        Manager manager = new Manager("Michael", 5000, 5, "2017-07-01", "Regional manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.getId() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
        }
    }
}