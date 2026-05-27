
public class equals {
    public static void main(String[] args) {
        String s1 = "tony" ; 
        String s2 = "tony" ; 
        String s3 = new String("tony");
        if (s1 == s2){
            System.out.println("The strings are same");
        }else{
            System.out.println("The strings are not equal");
        }
        if(s1 == s3){
            System.out.println("The stings are same");

        }else{
            System.out.println("The strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("The value of strings are equal");
        }else{
            System.out.println("The values of strings are not equal");
        }
    }
    
}
