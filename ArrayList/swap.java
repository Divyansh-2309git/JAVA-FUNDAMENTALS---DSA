
import java.util.ArrayList;


public class swap {
    public static void change(ArrayList<Integer> list ,int i , int v ){
        int temp = list.get(i); 
        list.set(i , list.get(v)); 
        list.set(v , temp); 

        
    }
    public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>(); 
    list.add(1); 
    list.add(2); 
    list.add(5);
    list.add(8); 

    change(list,1 , 2);
    for(int i = 0 ; i < list.size() ; i ++ ){
        System.out.println(list.get(i)); 
    }

    }
}