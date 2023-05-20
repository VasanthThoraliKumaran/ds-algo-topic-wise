package array;

public class TrappingRainWater {

    //O(N) : O(N)
    int findWater(int[] blocks){
        int len = blocks.length;
        int[] left = new int[len];
        int[] right = new int[len];
        for (int i = 1, j = len-2; i < len ; i++) {
            left[i] = Math.max(blocks[i], left[i-1]);
            right[i] = Math.max(blocks[j], right[j+1]);
        }
        int water = 0;

        for (int i = 0; i < len ; i++) {
          water += Math.min(left[i], right[i]) - blocks[i];
        }

        return water;
    }
}
