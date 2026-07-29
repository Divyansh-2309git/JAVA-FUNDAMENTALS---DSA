
import java.util.Comparator;
import java.util.PriorityQueue;


// By default the priority queue is in ascending order for the numbers 

public class priorityQueue{
    public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //By default the integers are pritoritize in the ascending order 
    // Pass comparator.reverseOrder() to reverse the priority order 
    pq.add(1); // O (log n ) for adding something in the priority queue 
    pq.add(2);        
    pq.add(3);
    pq.add(7); 
    pq.add(5) ; 


    while (!pq.isEmpty()){
        System.out.println(pq.peek());
        pq.remove(); // O(log n ) 
        
    }        
    }
}