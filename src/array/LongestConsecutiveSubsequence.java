package array;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {

    //O(N) :(N)
    int findLongestConSub(int[] arr, int n)
    {
        HashSet<Integer> S = new HashSet<>();
        int ans = 0;

        // Hash all the array
        for (int i = 0; i < n; ++i)
            S.add(arr[i]);

        for (int i = 0; i < n; ++i) {
            if (!S.contains(arr[i] - 1)) {
                int j = arr[i];
                while (S.contains(j))
                    j++;

                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;
    }
}
