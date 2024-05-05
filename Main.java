import java.util.ArrayList;
import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Marek", 5000, 1, "2024-01-01", "Młody Specjalista");
        Worker worker2 = new Worker("Antek", 10000, 2, "2019-06-15", "Starszy Specjalista");
        Worker worker3 = new Worker("Wojtek", 14000, 3, "2024-05-05", "Średni Specjalista");
        Worker worker4 = new Worker("Jakub", 4500, 4, "2022-02-22", "Starszy Specjalista");

        Manager manager = new Manager("Michał", 20000, 5, "2020-10-05", "Menadzer");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Pozycja: " + employee.getPosition() + ", Data_zatrudnienia: " + employee.getHireDate() + ", Wynagrodzenie: " + employee.getSalary() + ")");
        }
    }
}
