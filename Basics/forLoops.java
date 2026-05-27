import java.util.*;

public class forLoops {
    public static void main(String args[]) {
        // for (int line = 1; line <= 4; line++) {
        // System.out.println("****");
        // }

        // Reversing a number
        // int number = 234567;
        // while (number != 0) {
        // System.out.print(number % 10);
        // number = number / 10;

        // }

        // Reversing and saving the number

        // int number = 10899;
        // int reversed = 0;
        // while (number > 0) {
        // reversed = (reversed * 10) + (number % 10);
        // number = number / 10;

        // }
        // System.out.println(reversed);

        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();
            if (number % 10 == 0) {
                break;
            }

        }
    }

}
