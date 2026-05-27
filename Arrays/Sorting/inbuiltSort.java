package Arrays.Sorting;
import java.util.*;

public class inbuiltSort {
    public static void main(String[] args) {
        Integer  arr [] = {
            5 , 4 , 2 , 3 , 1 
        };
        // Arrays.sort(arr); //! this sorts the whole array 
        // Arrays.sort(arr , 0 , 3); //! From index 0 to 2 is sorted the rest is same 
        // to reverse the order of sorting i.e. descending order we use the Collection.reverseOrder()
        Arrays.sort(arr , Collections.reverseOrder());
        for(int i = 0 ; i < arr.length ; i ++){
            System.out.println(arr[i]);
        }
    }
}
