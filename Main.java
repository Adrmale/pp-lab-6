import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Marek", 5000, 1);
        Worker worker2 = new Worker("Antek", 10000, 2);
        Worker worker3 = new Worker("Wojtek", 14000, 3);
        Worker worker4 = new Worker("Jakub", 4500, 4);

        Manager manager = new Manager("Michal", 20000, 5);

        System.out.println("Pracownik_1 " + worker1.getSalary());
        worker1.work();

        System.out.println("Pracownik_2 " + worker2.getSalary());
        worker2.work();

        System.out.println("Pracownik_3 " + worker3.getSalary());
        worker3.work();

        System.out.println("Pracownik_4 " + worker4.getSalary());
        worker4.work();

        System.out.println("Pracownik_5 " + manager.getSalary());
        manager.work();
    }
}
