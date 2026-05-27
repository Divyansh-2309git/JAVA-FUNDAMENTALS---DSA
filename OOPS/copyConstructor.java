public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "Divyansh1";
        s1.roll = 4 ; 
        s1.password = "SagarSingh";

        Student s2 = new Student(s1); 
        s2.password  = "Aditi ji ";




    }
}
// This is a shallow copy of the contructor in which only the refrence is of one is given to another.
class Student{
    String name ; 
    int roll ; 
    String password ; 
    Student(Student s){
        this.name = s.name ; 
        this.roll = s.roll ; 
        
    }
    Student(){
        System.out.println("This is the construcotr called for the s1 ");
    }

    
    

}

