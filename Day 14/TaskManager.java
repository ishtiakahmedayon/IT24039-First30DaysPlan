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
