
import java.util.ArrayList;

public class maximum{
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>(); 
        list.add(1); 
        list.add(5); 
        list.add(3); 
        list.add(8); 
        list.add(11); 
        list.add(92); 

        int maximum = Integer.MIN_VALUE; 
        for (int i = 0 ; i < list.size() ; i ++){
            maximum = Math.max(list.get(i), maximum); 
        }
        System.out.print(maximum);
    }
}