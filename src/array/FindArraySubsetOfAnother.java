package array;

import java.util.HashMap;

public class FindArraySubsetOfAnother {

    //O(N) : O(N)
    boolean isSubset(int[] arr1, int m, int[] arr2,
                     int n) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < m; i++) {
            frequency.put(arr1[i], frequency.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (frequency.getOrDefault(arr2[i], 0) > 0)
                frequency.put(arr2[i],
                        frequency.get(arr1[i]) - 1);
            else {
                return false;
            }
        }
        return true;
    }
}
