public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish() ; 
        shark.eat();
        Dog doggy = new Dog(); 
        doggy.legs = 4 ; 
        doggy.barks = "Yes" ; 
        
    }
}
class Animal {
    String color ; 
    void eat(){

        System.out.println("eats");
    }
    void breathe (){
        System.out.println("Breathes");
    }
}

// ! Derived Class 
// Single level inheritance 
class Fish extends Animal {
    int fins ; 
    void swim(){
        System.out.println("Swims in water");
    }
} 

// ! There are 4 types of inheritance -
//  Singhle level
//  Multi-level 
//  Heirarchial 
//  Hybrid 

//  Muti-level inheritance 

class Mamal extends Animal{
    int legs ; 

}

class Dog extends Mamal{
    String barks ; 

}


