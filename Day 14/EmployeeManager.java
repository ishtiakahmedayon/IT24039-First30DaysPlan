import java.util.HashSet;

public class EmployeeManager {

    private HashSet<String> employees;
    public EmployeeManager(){
        employees = new HashSet<>();
    }

    public void addEmployee(String employee){
        employees.add(employee);
    }
    public void displayEmployees(){
        System.out.println("Employees in the company: ");
        for(String employee : employees){
            System.out.println(employee);
        }
    }


    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("Aronnok");
        manager.addEmployee("Opu");
        manager.addEmployee("Durga");

        manager.displayEmployees();
    }
}
