/**
 * Program Name : ImplementationHashMaps
 * Topic        : Hashing
 * Difficulty   : Advanced
 * Concepts     : Custom HashMap, Separate Chaining, Hash Function, Rehashing
 * -------------------------------------------------------------
 * Description  :
 * Custom implementation of a HashMap from scratch using an array of LinkedList buckets
 * and separate chaining to resolve collisions, featuring dynamic rehashing.
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementationHashMaps {

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Total number of key-value pairs
        private int N; // Number of buckets (array size)
        private LinkedList<Node>[] buckets; // Bucket array

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return i; // Index of key in LinkedList
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Copy nodes from old buckets to new buckets
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value; // Key exists, update value
            } else {
                buckets[bi].add(new Node(key, value)); // Key doesn't exist, insert new node
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Nepal", 5);

        ArrayList<String> keys = map.keySet();
        System.out.println("Custom HashMap Keys and Values:");
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("Get India: " + map.get("India"));
        System.out.println("Remove India: " + map.remove("India"));
        System.out.println("Get India after remove: " + map.get("India"));
    }
}