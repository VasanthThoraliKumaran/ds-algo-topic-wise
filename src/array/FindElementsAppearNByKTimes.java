package array;

import java.util.HashMap;

public class FindElementsAppearNByKTimes {

    //O(N) : O(N)
    void solution(int[] arr, int n, int k) {
        int comp = n / k;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int x : map.keySet()) {
            if (map.get(x) > comp)
                System.out.print(x + " ");
        }
    }
}
