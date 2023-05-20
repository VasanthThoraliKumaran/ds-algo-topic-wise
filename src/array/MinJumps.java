package array;

public class MinJumps {

    //O(n) : O(1)
    int findMinJumps(int[] arr){
        int max_limit = arr[0];
        int jumps = 0;
        int len = arr.length;
        int so_far = arr[0];
        for(int i=0;i<len;i++){
            if(i > max_limit){
                max_limit = so_far;
                jumps++;
            }
            so_far = Math.max(arr[i] + i, so_far);
        }

        //1 1 3 1
        return jumps;
    }
}
