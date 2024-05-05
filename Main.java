import java.util.ArrayList;
import java.util.List;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Marek", 5000, 1, "2024-01-01", "Młody Specjalista");
        Worker worker2 = new Worker("Antek", 10000, 2, "2019-06-15", "Starszy Specjalista");
        Worker worker3 = new Worker("Wojtek", 14000, 3, "2024-05-05", "Średni Specjalista");
        Worker worker4 = new Worker("Jakub", 4500, 4, "2022-02-22", "Starszy Specjalista");
        Worker worker5 = new Worker("Tomek", 2500, 2, "2023-06-30", "Software Engineer"); 

        Manager manager1 = new Manager("Michal",20000 , 5, "2020-05-10", "Menadzer");
        Manager manager2 = new Manager("Sara", 30000, 6, "2023-09-15", "Starszy Menadzer"); 

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5); 
        employees.add(manager1);
        employees.add(manager2); 

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Wartosc pensji wszystkich w firmie: " + totalSalary);
        System.out.println("Wartosc pensji wszystkich managerow: " + totalManagerSalary);
        System.out.println("Wartosc pensji wszytkich pracownikow : " + totalWorkerSalary);

             List<Employee> matchingEmployees = new ArrayList<>();
         

        for (Employee employee : employees) {
            if (employee.equals(worker5)) {
                matchingEmployees.add(employee);
            }
        }

        
        if (!matchingEmployees.isEmpty()) {
            System.out.println("Znaleziono pracowników o identycznym ID:");
            for (Employee employee : matchingEmployees) {
                System.out.println(" - " + employee.getName());
            }
        } else {
            System.out.println("Nie znaleziono pracowników o podanym ID.");
        }
    }
}
