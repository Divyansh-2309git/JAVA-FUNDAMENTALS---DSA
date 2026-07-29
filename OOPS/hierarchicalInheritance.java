public class heirarchialInheritance {
    public static void main(String[] args) {
        Birds flacon = new Birds() ; 
        flacon.breaths();
        Mamal elephant = new Mamal() ; 
        elephant.breaths(); 
        elephant.walks() ; 
        Fish salmon = new Fish() ; 
        salmon.breaths(); 
        
        
    }
}
class  Animal {
    void breaths(){
        System.out.println("The animal breathes");
    }
}
class Fish extends Animal{
    void Swims(){
        System.out.println("The Fish swims");
    }
}
class Mamal extends Animal {
    void walks(){
        System.out.println("The mamal walks");
        
    }
}
class Birds extends Animal{
    void flies(){
        System.out.println("The bird flies");
    }
}
