
import java.util.ArrayList;


public class multiDimension{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); 
        ArrayList <Integer> list = new ArrayList<>(); 
        list.add(1); 
        list.add(5); 
        list.add(3); 
        list.add(8); 
        list.add(11); 
        list.add(92);

        mainList.add(list);  

        ArrayList <Integer> list2 = new ArrayList<>(); 
        list2.add(3); 
        list2.add(12); 
        list2.add(16); 
        mainList.add(list2); 

        System.out.print(mainList); 
    }
}