
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueueForObjects{
    static class Students implements  Comparable<Students>{
        String name ; 
        int rank ; 

        public Students(String name , int rank ) {
            this.name = name ; 
            this.rank = rank ; 

        }
        @Override 
        public int compareTo(Students s2){
            return this.rank - s2.rank ; 
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Students > pq = new PriorityQueue<>(Comparator.reverseOrder()) ; 
        pq.add(new Students("A" , 10)); 
        pq.add(new Students("B" , 25)); 
        pq.add(new Students("C" , 12)); 
        pq.add(new Students("D" , 2)); 

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name) ; 
            pq.remove(); 
        }
    }
}