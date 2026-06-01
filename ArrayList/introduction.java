package ArrayList;
import java.util.*;
public class introduction {
    public static void main (String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        // Add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        
        // Get Operation 
        int element = list.get(0);
        System.out.println(element);
        
        // Remove element 
        list.remove(2);
        System.out.println(list);
        
        // Set an element or add an element inside the arraylist 
        list.set(2 , 10);
        System.out.println(list);

        // Size of an arraylist
        System.out.println(list.size());

        // Printing  an Arraylist 

        for (int i = 0 ; i < list.size() ; i ++ ){
            System.out.println(list.get(i)); 
        }

        // Reversing an arraylist 
        for (int i = list.size() -1 ; i >= 0 ; i --){
            System.out.println(list.get(i));
        }

    }
}
