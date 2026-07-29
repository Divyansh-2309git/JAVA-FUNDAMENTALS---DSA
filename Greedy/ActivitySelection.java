/**
 * Program Name : ActivitySelection
 * Topic        : Greedy Algorithms
 * Difficulty   : Intermediate
 * Concepts     : Greedy Choice Property, Interval Scheduling, Activity Selection
 * -------------------------------------------------------------
 * Description  :
 * Solves the Activity Selection problem by greedy selection based on activity finish times.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelection {

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end =   {2, 4, 6, 7, 9, 9};

        // 2D matrix to store [index, start, end] for sorting if end times are unsorted
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Sort activities based on end time (column 2)
        Arrays.sort(activities, (a, b) -> Integer.compare(a[2], b[2]));

        int maxActivities = 1;
        ArrayList<Integer> selectedIndices = new ArrayList<>();

        // Select 1st activity
        selectedIndices.add(activities[0][0]);
        int lastEndTime = activities[0][2];

        for (int i = 1; i < start.length; i++) {
            // If activity start time >= last selected activity end time, select it
            if (activities[i][1] >= lastEndTime) {
                maxActivities++;
                selectedIndices.add(activities[i][0]);
                lastEndTime = activities[i][2];
            }
        }

        System.out.println("Maximum activities that can be performed: " + maxActivities);
        System.out.println("Selected activity indices: " + selectedIndices);
    }
}
