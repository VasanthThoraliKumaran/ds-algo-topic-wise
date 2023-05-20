package array;

import java.util.Arrays;

public class MergeSortedArrays {
    private void moveArrayOneStep(int[] a, int fromIndex){
        int n = a.length;
        for (int i = n-1; i > fromIndex; i--) {
            a[i] = a[i - 1];
        }
    }

    //O(l1 * l2) : O(1)
    void merge(int[] big, int[] small){
        int l1 = big.length;
        int l2 = small.length;
        int i, j = l2 - 1;
        while (j > -1){
                for (i = l1 - 1; i > -1; i--) {
                    if (big[i] <= small[j]) {
                        int target = small[j];
                        int last = big[l1 - 1];
                        moveArrayOneStep(big, i + 1);
                        big[i + 1] = target;
                        small[j] = last;
                        System.out.println(Arrays.toString(big));
                        break;
                    }
                }
            j--;
        }

        System.out.println(Arrays.toString(big) + " " + Arrays.toString(small));

    }
}
