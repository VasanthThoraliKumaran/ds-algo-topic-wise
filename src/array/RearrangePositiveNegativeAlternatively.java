package array;

import java.util.Arrays;

public class RearrangePositiveNegativeAlternatively {
    void rightRotate(int[] arr, int n, int outOfPlace,
                     int cur)
    {
        int tmp = arr[cur];
        for (int i = cur; i > outOfPlace; i--)
            arr[i] = arr[i - 1];
        arr[outOfPlace] = tmp;
    }

    //O(N1(loop) * N2(right-rotate)) : O(1)
    void rearrange(int[] arr, int n)
    {
        int outOfPlace = -1;

        for (int index = 0; index < n; index++) {
            if (outOfPlace >= 0) {
                if (((arr[index] >= 0)
                        && (arr[outOfPlace] < 0))
                        || ((arr[index] < 0)
                        && (arr[outOfPlace] >= 0))) {
                    rightRotate(arr, n, outOfPlace, index);

                    // the new out-of-place entry is now 2
                    // steps ahead
                    if (index - outOfPlace >= 2)
                        outOfPlace = outOfPlace + 2;
                    else
                        outOfPlace = -1;
                }
            }

            // if no entry has been flagged out-of-place
            if (outOfPlace == -1) {
                // check if current entry is out-of-place
                if (((arr[index] >= 0)
                        && ((index & 0x01) == 0))
                        || ((arr[index] < 0)
                        && (index & 0x01) == 1))
                    outOfPlace = index;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
