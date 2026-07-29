
import java.util.ArrayList;

public class insertInHeap{
    public class Heap{
        ArrayList<Integer> arr = new ArrayList<>() ; 
        public void add(int data){
            // add at last index 
            arr.add(data) ; 
            int x = arr.size() - 1 ; // index of the child node 
            int par = (x - 1) / 2  ; //  index of the parent node by formula (x - 1) / 2 

            while(arr.get(x) < arr.get(par)){
                
            }
        }

    }
    public static void main(String[] args) {
        
    }
}