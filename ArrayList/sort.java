
import java.util.ArrayList;
import java.util.Collections;


public class sort{
    public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>(); 
    list.add(1); 
    list.add(5); 
    list.add(3); 
    list.add(8); 
    list.add(11); 
    list.add(92); 

    Collections.sort(list);
    System.out.println(list); 

    }
}