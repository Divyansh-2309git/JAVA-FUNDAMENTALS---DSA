import java.util.*;

public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        char character = 'A';
        for (int line = 1; line <= lines; line++) {
            for (int ch = 1; ch <= line; ch++) {
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
    }

}
