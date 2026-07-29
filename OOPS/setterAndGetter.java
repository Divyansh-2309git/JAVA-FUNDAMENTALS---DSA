/**
 * Program Name : setterAndGetter
 * Topic        : Object-Oriented Programming (OOP)
 * Difficulty   : Beginner
 * Concepts     : Encapsulation, Private Fields, Getter & Setter Methods
 * -------------------------------------------------------------
 * Description  :
 * Demonstrates how getter and setter methods provide controlled access to private class variables.
 */
public class setterAndGetter {
    public static void main(String[] args) {
        EncapsulatedPen pen = new EncapsulatedPen();
        pen.setColor("Blue");
        pen.setTip(5);

        System.out.println("Pen Color: " + pen.getColor());
        System.out.println("Pen Tip Size: " + pen.getTip());
    }
}

class EncapsulatedPen {
    private String color;
    private int tip;

    public String getColor() {
        return this.color;
    }

    public int getTip() {
        return this.tip;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}
