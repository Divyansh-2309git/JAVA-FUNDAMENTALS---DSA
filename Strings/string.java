import java.util.*;

public class string {
    public static void main(String[] args) {
        char arr[] = {'a' , 'b' , 'c' , 'd'};
        String str = "abcdef" ; 
        String str2 = new String("xyz");


        // Strings are IMMUTABLE  in java
        
        Scanner sc = new Scanner(System.in);
        // String newStr = sc.next(); //! next() only takes the input for 1st letter i.e not the whole line 
        String newStr = sc.nextLine(); //! nextLine() takes the whole line as the input in the system 
        System.out.print(newStr);

    }
    
}
