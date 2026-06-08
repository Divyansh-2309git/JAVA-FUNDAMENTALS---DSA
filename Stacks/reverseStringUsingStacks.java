import java.util.*; 

public class reverseStringUsingStacks{
    public static String reverse(String str){ 
        Stack<Character> s = new Stack<>(); 
        int idx = 0 ; 
        while(idx < str.length()){
            s.push(str.charAt(idx)) ; 
            idx ++ ; 
        }
        StringBuilder result = new StringBuilder(""); 
        while(!s.isEmpty()){
            result.append(s.pop()) ; 

        }
        String newStr = result.toString(); 
        return newStr ; 
    }
    public static void main(String[] main){
        String str = "abc"; 
        System.out.println(reverse(str)); 

        
    }       

}