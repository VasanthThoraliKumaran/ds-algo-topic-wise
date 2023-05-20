package array;

import java.util.Arrays;

public class TripletSum {

    //O(N^2) : O(1)
    boolean hasSum(int[] arr, int sum){
        Arrays.sort(arr);
        int len = arr.length;
        for (int i = 0; i < len - 2 ; i++) {
            int l = i+1;
            int r = len - 1;
            while (l < r){
                int expectedSum = arr[i] + arr[l] + arr[r];
                if(expectedSum == sum)return true;
                else if(expectedSum < sum){
                    l++;
                }else r--;
            }
        }

        return false;
    }
}
