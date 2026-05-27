public class typesOfConstructors {
    public static void main(String[] args) {
        Student a = new Student("hello"); 
        
    }
}

class Student{
    String name ; 
    int age ;
    Student(){
        System.out.println("This is an un-paramterised constructor which does not need any parameters");
    }
    Student (String parameter){
        System.out.println("This is the paramterisec constructor which needs parameter , here parameter is :" + parameter );
    }
}
// the construtors show polymorphism and when we call the constructor , according to the parameters the suitable one will be called only . 
