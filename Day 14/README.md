### EmployeeManager.java
```
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

```

### OrderManagement.java
```
import java.util.HashMap;

public class OrderManagement{
    private HashMap<Integer, String> orders;

    public OrderManagement(){
        orders = new HashMap<>();
    }

    public void addOrder(int orderId, String customerName){
        orders.put(orderId, customerName);
    }
    public void displayOrders(){
        System.out.println("Customer Orders: ");
        for(Integer orderId : orders.keySet()){
            System.out.println("Order ID: " + orderId + ", Customer Name: " + orders.get(orderId));

        }
    }


    public static void main(String[] args) {
        OrderManagement order = new OrderManagement();
        order.addOrder(101, "Shomriddhi");
        order.addOrder(102, "Babodhi");
        order.addOrder(103, "Odhi");
        order.displayOrders();
    }
}

```

### TaskManager.java

```
import java.util.LinkedList;

public class TaskManager {
    private LinkedList<String> tasks;
    public TaskManager(){
        tasks = new LinkedList<>();
    }
    public void addTask(String task){
        tasks.add(task);
    }
    public void completeTask(){
        if(!tasks.isEmpty()){
            String completedTask = tasks.removeFirst();
            System.out.println("- Completed task: " + completedTask);
            
        }else{
            System.out.println("No tasks to complete");
        }
    }
    public void displayTasks(){
        System.out.println("# Current Tasks: ");
        Integer count = 1;
        for(String task : tasks){
            System.out.println("Task " + count + ": " + task);
            count ++;
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Os Lab Report");
        manager.addTask("Check Emails");
        manager.addTask("10000 steps");

        manager.displayTasks();
        manager.completeTask();
        manager.displayTasks();
    }       
}

```