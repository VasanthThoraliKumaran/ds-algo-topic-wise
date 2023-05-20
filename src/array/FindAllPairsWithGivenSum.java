package array;

import java.util.HashMap;

public class FindAllPairsWithGivenSum {


    //O(N) : O(1)
    void printPairs(int[] arr, int n,
                    int sum) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        // Traverse through all elements
        for (int i = 0; i < n; i++) {
            int rem = sum - arr[i];
            if (mp.containsKey(rem)) {
                int count = mp.get(rem);

                for (int j = 0; j < count; j++)
                    System.out.print("(" + rem +
                            ", " + arr[i] +
                            ")" + "\n");
            }
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
    }
}
