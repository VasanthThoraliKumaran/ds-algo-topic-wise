package array;

import java.util.Arrays;

public class CyclicRotateByOne {

    //O(n - 1) : O(1)
    void rotate(int[] a) {
        int len = a.length;
        int lastEle = a[len - 1];

        for(int i = len - 2; i >= 0;i--){
            a[i + 1] = a[i];
        }
        a[0] = lastEle;

        System.out.println(Arrays.toString(a));
    }
}
