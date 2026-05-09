import java.util.LinkedList;
import java.util.Queue;

public class Example2 {
	public static void main(String[] args) {
		Queue<String> customerQueue = new LinkedList<>();

        //customers arrive and join the queue

        customerQueue.offer("Ayon");
        customerQueue.offer("Rion");
        customerQueue.offer("Shishir");


        System.out.println("Queue:" + customerQueue);

        String servedCustomer = customerQueue.poll();

        System.out.println("Serving:" + servedCustomer);

        System.out.println("Customer queue after serving one customer" + customerQueue);
	}
}
