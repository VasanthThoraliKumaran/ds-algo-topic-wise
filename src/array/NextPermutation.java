package array;

import java.util.Arrays;

public class NextPermutation {

    private  void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    //O(N) : O(1)
    void findNextPermutation(int[] arr){
        int len = arr.length;
        int i = len - 2;
        for(;i >=0;i--){
            if(arr[i] < arr[i+1])break;
        }

        if(i < 0){
            reverse(arr, 0 , len - 1);
        }else {
            int j = len-1;
            for (; j > i ; j--) {
                   if(arr[j] > arr[i])break;
            }

            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            reverse(arr, i+1, len-1);
        }

        System.out.println(Arrays.toString(arr));
    }
}
