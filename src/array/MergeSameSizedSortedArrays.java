package array;

import java.util.Arrays;

public class MergeSameSizedSortedArrays {
    private void swap(int[] a,int[] b, int i1, int i2){
        int t = a[i1];
        a[i1] = b[i2];
        b[i2] = t;
    }

    //O(m+n log(m+n)) : O(1)
    void merge(int[] a, int[] b){
        int i=0,j = 0, k = a.length - 1;

        while (i < a.length && j < b.length){
            if (a[i] <= b[j]) {
               i++;
            }else {
                int t = a[i];
                a[i] = b[k];
                b[k] = t;
                j++;
                k--;
            }

        }

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a) +" "+ Arrays.toString(b));
    }
}
