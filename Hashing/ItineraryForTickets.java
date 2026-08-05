/**
 * Program Name : ItineraryForTickets
 * Topic        : Hashing
 * Difficulty   : Intermediate
 * Concepts     : HashMap, Reverse Mapping, Graph Traversal
 * -------------------------------------------------------------
 * Description  :
 * Reconstructs a complete travel itinerary from flight tickets (From -> To) by finding the starting airport.
 */
import java.util.HashMap;

public class ItineraryForTickets {

    /**
     * Finds the starting airport (a source city that is never a destination).
     */
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // Starting Point (never destination)
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);

        // Print the full path from start to final destination
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
