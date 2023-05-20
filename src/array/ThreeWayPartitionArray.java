package array;

import java.util.Arrays;

public class ThreeWayPartitionArray {

    //Two-pointer technique
    //O(N) : O(1)
    void partition(int[] a, int lowVal, int highVal){
        int s = 0, e = a.length - 1;
        for (int i = 0; i <= e;) {
            if(a[i] < lowVal){
                int t = a[i];
                a[i] = a[s];
                a[s] = t;
                s++;
                i++;
            }else if(a[i] > highVal){
                int t = a[i];
                a[i] = a[e];
                a[e] = t;
                e--;
            }else i++;
        }

        System.out.println(Arrays.toString(a));
    }
}
