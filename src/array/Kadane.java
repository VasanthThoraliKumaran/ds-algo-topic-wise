package array;

public class Kadane {

    //O(n) : O(1)
    int kadaneAlgo(int[] arr){
        int local_max = arr[0];
        int global_max = Integer.MIN_VALUE;

        for (int i=1;i<arr.length;i++) {
            local_max = Math.max(arr[i], arr[i] + local_max);
            global_max = Math.max(global_max, local_max);
        }

        return global_max;
    }
}
