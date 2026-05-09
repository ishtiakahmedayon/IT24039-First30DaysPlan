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
