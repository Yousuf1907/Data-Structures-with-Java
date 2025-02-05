import java.util.PriorityQueue;

public class PriorQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        pQ.add(5);
        pQ.add(10);
        pQ.add(3);

        while (!pQ.isEmpty()) {
            System.out.println(pQ.poll());
        }
    }
}