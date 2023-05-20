package array;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

    //O(N) : O(N)
    boolean hasSubArrayWithZeroSum(int[] arr) {
        Set<Integer> prefix_sum = new HashSet<>();
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (j == 0 || sum == 0 || prefix_sum.contains(sum)) return true;
            prefix_sum.add(sum);
        }
        return false;
    }
}
