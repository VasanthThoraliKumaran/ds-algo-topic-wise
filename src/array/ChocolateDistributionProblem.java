package array;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    // O(N logN) : O(1)
    int minDiff(int[] chocs, int students){
        int len = chocs.length;
        if(len == 0 || students == 0)return 0;
        int min_diff = Integer.MAX_VALUE;
        if(len < students)return min_diff;

        Arrays.sort(chocs);

        for (int i = 0; i + students -1 < len; i++) {
            min_diff = Math.min(min_diff, chocs[i + students - 1] - chocs[i]);
        }
        return min_diff;
    }
}
