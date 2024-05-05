import models.Manager;
import models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jim", 2200, 1);
        Worker worker2 = new Worker("Dwight", 2500, 2);
        Worker worker3 = new Worker("Pamela", 1800, 3);
        Worker worker4 = new Worker("Andy", 2000, 4);

        Manager manager = new Manager("Michael", 5000, 5);

        System.out.println("Manager's salary: " + manager.getSalary());
        manager.work();

        System.out.println("Worker 1's salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Worker 2's salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("Worker 3's salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("Worker 4's salary: " + worker4.getSalary());
        worker4.work();
    }
}