package array;

public class MinSwapsToBringElementsKTogether {


    //O(n) : O(1)
    int minSwaps(int[] a, int k){
        int n = a.length;
        int c = 0;
        int ans = -1;
        for (int i = 0; i < n ; i++) {
            if(a[i] <= k){
                c++;
            }
        }
        int b = 0;
        for (int i = 0; i < c; i++) {
            if(a[i] > k){
                b++;
            }
        }
        ans = b;
        for (int i = 0, j = c; j < n ; i++, j++) {
            if(a[i] > k){
                --b;
            }

            if(a[j] > k){
                ++b;
            }

            ans = Math.min(ans, b);
        }

        return ans;
    }
}
