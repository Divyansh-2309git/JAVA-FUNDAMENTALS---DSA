/**
 * Program Name : friendPair
 * Topic        : RecursionBasics
 * Difficulty   : Intermediate
 * Concepts     : Combinatorics, Recursion Tree, Friends Pairing Problem
 * -------------------------------------------------------------
 * Description  :
 * Solves Friends Pairing Problem: Given N friends, each can remain single or pair up with any friend.
 * Total ways f(n) = f(n-1) + (n-1) * f(n-2).
 */
public class friendPair {

    public static int countPairingWays(int n) {
        // Base cases: 1 friend -> 1 way; 2 friends -> 2 ways (both single or paired)
        if (n == 1 || n == 2) {
            return n;
        }

        // Choice 1: Remains single -> f(n-1)
        int singleWays = countPairingWays(n - 1);

        // Choice 2: Pairs up with any of (n-1) friends -> (n-1) * f(n-2)
        int pairWays = (n - 1) * countPairingWays(n - 2);

        return singleWays + pairWays;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Total ways to pair " + n + " friends: " + countPairingWays(n));
    }
}
