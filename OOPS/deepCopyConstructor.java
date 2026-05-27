public class deepCopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student() ; 
        s1.name = "Divyansh";
        s1.age = 18 ; 
        s1.marks[0] = 100 ; 
        s1.marks[1] = 90 ; 
        s1.marks[2] = 50 ; 
        // Student s2 = new Student(s1); 
        // s2.password = "SagarSingh" ; 
        // System.out.println(s2.marks[2]);
        
    }
}
class Student {
    String name ; 
    int age ; 
    String password ; 
    int marks[];

    Student(){
        System.out.println("The deafualt cons. is being used. ");
    }
    Student(Student s){
        this.name = s.name ; 
        this.age = s.age;
        marks = new int[3]; 
        for (int i =0 ; i < 3 ; i ++ ){
            this.marks[i] = s.marks[i];
        }


    }

    
}