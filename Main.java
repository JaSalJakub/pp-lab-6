import models.Manager;
import models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jim", 2500, 1, "2020-01-01", "Trader");
        Worker worker2 = new Worker("Dwight", 2200, 2, "2019-05-15", "Trader");
        Worker worker3 = new Worker("Pamela", 1800, 1, "2021-03-10", "Assistant"); 
        Manager manager = new Manager("Michael", 5000, 3, "2017-07-01", "Regional manager");
        
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager));
    }
}