package RecursionBasics;

public class friendPair {
    public static int pair( int n ){
        if (n == 1 || n == 2){
            return n ;
        }
        int fm1 = pair(n -1 );

        int fm2 = pair(n - 2);
        int pairWays = (n - 1 ) * pair(n - 2);

        int totalWays = fm1 + pairWays ; 
        return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(pair(3));

    }
}
