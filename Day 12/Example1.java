import java.util.LinkedList;
import java.util.Queue;

public class Example1 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(10);
		queue.offer(20);
		queue.offer(30);

		System.out.println(queue);

		String removedItem = queue.poll().toString();
		System.out.println("Removed Item: " + removedItem);

		System.out.println("Queue after dequeue: " + queue);
	}
}
