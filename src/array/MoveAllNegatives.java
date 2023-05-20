package array;

import java.util.Arrays;

public class MoveAllNegatives {

    //Apply Quicksort partition process -> O(n) : O(1)
    //Does not maintains order
    void moveAllNegatives(int[] arr){
        int len = arr.length;
        int j=0;
        for(int i=0;i < len;i++){
            if(arr[i] < 0){
               if(i != j){
                   int t = arr[i];
                   arr[i] = arr[j];
                   arr[j] = t;
               }
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    //O(n) : O(1)
     void moveAllNegativesTwoPointer(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            if(arr[left] < 0 && arr[right] < 0){
                left++;
            }else if(arr[left] > 0 && arr[right] > 0){
                right--;
            }else if(arr[left] > 0 && arr[right] < 0){
                int t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;
                left++;
                right--;
            }else  {
                left++;
                right--;
            }
        }
         System.out.println(Arrays.toString(arr));
     }

     //maintain order -> Sliding Window + Two pointer approach
     //O(n * window_size) : O(1)
    void moveAllNegativesWithOrder(int[] arr) {
        int i = 0;
        int j= 0;
       while (j < arr.length){
           if(arr[j] >= 0){
               //increasing window length
               j++;
           }else {
               for(int k = j;  k > i;k--){
                   int t = arr[k];
                   arr[k] = arr[ k - 1];
                   arr[k-1] = t;
               }
               i++;
               j++;

           }
       }
        System.out.println(Arrays.toString(arr));

    }
}
