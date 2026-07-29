/**
 * Program Name : ClassesAndObjectsDemo
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Classes, Objects, Instance Variables, Methods
 * -------------------------------------------------------------
 * Description  :
 * Fundamental demonstration of creating a class template (Pen) and instantiating object instances.
 */
public class ClassesAndObjectsDemo {
    public static void main(String[] args) {
        SimplePen p1 = new SimplePen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println("Pen Color: " + p1.color);
        System.out.println("Pen Tip Size: " + p1.tip);

        p1.setColor("Yellow");
        System.out.println("Updated Pen Color: " + p1.color);
    }
}

class SimplePen {
    String color;
    int tip;

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}
