/**
 * Program Name : RemoveFromHeap
 * Topic        : Heaps
 * Difficulty   : Beginner
 * Concepts     : Heap Implementation, Remove the Root form the heap, Min-Heap
 * -------------------------------------------------------------
 * Description  :
 * Implements and demonstrates the Remove operation in a Heap using an ArrayList.
 * Remove the top/minimum element (root) located at index 0 in O(Log N) time complexity.
 * 
 * Approach:
 * Swap the root element with the last element 
 * Remove the last element 
 * Heapify the whole array. 
 */
import java.util.ArrayList;

public class RemoveFromHeap{

    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int childIndex = arr.size() - 1;
            int parentIndex = (childIndex - 1) / 2;

            // Up-heapify (swap with parent while child < parent) O(log N)
            while (childIndex > 0 && arr.get(childIndex) < arr.get(parentIndex)) {
                // Swap
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }

        private void heapify (int i ){
            int left = 2 * i + 1 ; 
            int right = 2 * i + 2 ; 
            int minIndex = i ; 

            if(left < arr.size()  && arr.get(left) < arr.get(minIndex)){
                minIndex = left ; 
            }

            if(right < arr.size() && arr.get(right) < arr.get(minIndex)){
                minIndex = right ; 
            }

            if(minIndex != i ){
                int temp = arr.get(i) ; 
                arr.set(i , arr.get(minIndex)); 
                arr.set(minIndex , temp) ; 

                heapify(minIndex);
            }
        }
        public boolean isEmpty(){
            return arr.size() == 0 ; 
        }

        public int remove() {
            int data = arr.get(0) ; 

            //Step 1 = Swapping the first element with the last element 
            int temp = arr.get(0); 
            arr.set(0 , arr.get(arr.size() -1) ) ; 
            arr.set(arr.size() - 1 , temp ) ; 

            //Step 2 = Deleting the last element 
            arr.remove(arr.size() - 1); 

            //Step 3 = Heapify 
            heapify(0);
            return data ; 
        }
        public int peek(){
            return arr.get(0); 
        }
    }
   

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);

        while(!heap.isEmpty()){
            System.out.println(heap.peek()); 
            heap.remove() ; 
        }
       
    }
}