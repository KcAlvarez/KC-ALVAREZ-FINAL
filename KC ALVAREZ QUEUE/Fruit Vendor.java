import java.util.LinkedList;
import java.util.Queue;

public class Fruit Vendor {

    public static void main(String[] args) {
        // Queue is implemented using the LinkedList class
        Queue<String> Fruit Vendor = new LinkedList<String>();

        // Adding people to the queue (FIFO: First-In, First-Out)
        Fruit Vendor.add(“Harvey”);
        Fruit Vendor.add(“Mycho”);
        Fruit Vendor.add(“Jeremy”);
        
        System.out.println(Fruit Vendor.poll());
        
        System.out.println(“Current Fruit Vendor
: “ + Fruit Vendor);
    }
}