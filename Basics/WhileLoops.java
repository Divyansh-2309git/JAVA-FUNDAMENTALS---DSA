import java.util.*;

public class WhileLoops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= number) {
            sum += counter;
            counter++;

        }
        System.out.println(sum);
    }
}
