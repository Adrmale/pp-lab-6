import company.models.Manager;
import company.models.Worker;


public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Marek", 5000, 1, "2024-01-01", "Młody Specjalista");
        Worker worker2 = new Worker("Antek", 10000, 2, "2019-06-15", "Starszy Specjalista");
        Worker worker3 = new Worker("Wojtek", 14000, 3, "2024-05-05", "Średni Specjalista");
        Worker worker4 = new Worker("Jakub", 4500, 4, "2022-02-22", "Starszy Specjalista");

        Manager manager = new Manager("Michał", 20000, 5, "2020-10-05", "Menadzer");

        System.out.println(worker1.getName() + " ma kod: " + worker1.hashCode());
        System.out.println(worker2.getName() + " ma kod: " + worker2.hashCode());
        System.out.println(worker3.getName() + " ma kod: " + worker3.hashCode());
        System.out.println(worker4.getName() + " ma kod: " + worker4.hashCode());
        System.out.println(manager.getName() + " ma kod: " + manager.hashCode());

        System.out.println(worker1.getName() + " równa się z pracownikiem_2: " + worker1.equals(worker2));
        System.out.println(worker1.getName() + " równa się z pracownikiem_3: " + worker1.equals(worker3));
        System.out.println(worker1.getName() + " równa się z Manadzerem: " + worker1.equals(manager));
    }
}
