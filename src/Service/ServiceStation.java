package Service;
import java.util.Queue;
import java.util.LinkedList;

import transport.Transport;

public class ServiceStation {
    private Queue<Transport>queue;

    public ServiceStation() {
        this.queue = new LinkedList<>();
    }

    public void addTransport(Transport transport) {
        queue.offer(transport);
    }

    public void doInspectionCar() {
        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
    }
}
