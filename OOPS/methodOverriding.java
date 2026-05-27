public class methodOverriding {
    public static void main(String[] args) {
        Deer d1 = new Deer() ; 
        d1.eats();
        
    }
}
class Animal{
    void eats(){
        System.out.println("The animal eats anything ");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("The deer eats grass");
    }
}