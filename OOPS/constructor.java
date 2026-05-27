public class constructor {
    public static void main(String args[]) {
        Student s1 = new Student("Divyansh") ; 
        System.out.println(s1.name) ; 

        
    }
}
class Student{
    String name ; 
    int roll ; 
    Student (String name ){
        System.out.println("The constructor is called");
    }

}
