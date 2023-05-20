package array;

import java.util.Arrays;

public class FindMinMax {

    //O(n) : O(1)
    void findMinMax(int[] inputArray){
        if(inputArray.length == 0)return;
        int min = inputArray[0];
        int max = inputArray[0];

        for(int i: inputArray){
            if(i < min){
                min = i;
            }

            if(i > max){
                max = i;
            }
        }
        System.out.println("Min: "+min+" Max: "+ max);
    }

    //O(n log n) : O(n)
    void findMinMaxUsingSort(int[] inputArray){
        if(inputArray.length == 0)return;
        Arrays.sort(inputArray);
        System.out.println("Min: "+inputArray[0]+" Max: "+ inputArray[inputArray.length - 1]);
    }
}
