import models.Manager;
import models.Worker;
import abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {       
        Worker worker1 = new Worker("Jim", 2500, 1, "2020-01-01", "Trader");
        Worker worker2 = new Worker("Dwight", 2200, 2, "2019-05-15", "Trader");
        Worker worker3 = new Worker("Pamela", 1800, 1, "2021-03-10", "Assistant");
        Worker worker4 = new Worker("Ryan", 1500, 4, "2018-11-20", "Intern");
        Worker worker5 = new Worker("Kevin", 2300, 5, "2017-10-05", "Accountant"); 
        Manager manager1 = new Manager("Michael", 5000, 3, "2017-07-01", "Regional manager");
        Manager manager2 = new Manager("Robert", 6000, 6, "2016-09-15", "President"); 

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalaryAllEmployees = 0;
        double totalSalaryManagers = 0;
        double totalSalaryWorkers = 0;

        for (Employee employee : employees) {
            totalSalaryAllEmployees += employee.getSalary(); 
            if (employee instanceof Manager) {
                totalSalaryManagers += employee.getSalary(); 
            } else if (employee instanceof Worker) {
                totalSalaryWorkers += employee.getSalary(); 
            }
        }

        System.out.println("Total salary of all employees: " + totalSalaryAllEmployees);
        System.out.println("Total salary of all managers: " + totalSalaryManagers);
        System.out.println("Total salary of all workers: " + totalSalaryWorkers);

        for (int i = 0; i < employees.size() - 1; i++) {
            Employee employee = employees.get(i);
            for (int j = i + 1; j < employees.size(); j++) {
                Employee otherEmployee = employees.get(j);
                if (employee.getId() == otherEmployee.getId()) {
                    System.out.println("Found matching employees with ID: " + employee.getId());
                    System.out.println("Employee 1: " + employee.getName());
                    System.out.println("Employee 2: " + otherEmployee.getName());
                }
            }
        }
    }
}