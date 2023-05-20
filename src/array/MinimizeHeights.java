package array;

import java.util.Arrays;

public class MinimizeHeights {

    //O(n) : O(1)
    int minimizeHeightOfTowers(int[] a, int k) {
        Arrays.sort(a);
        int n = a.length;
        int ans = a[n - 1] + a[0];
        int tMin;
        int tMax;
        for(int i=0;i<a.length;i++){

            if(a[i] - k < 0)continue;

            tMin = Math.min(a[0] + k, a[i] - k);
            tMax = Math.max(a[n-1] - k, a[i-1] + k);
            ans  = Math.min(ans, tMax - tMin);
        }

        return ans;
    }
}
