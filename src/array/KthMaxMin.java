package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaxMin {

    //O(n log n) : O(n)
    void findKthMaxMinElement(int[] inputArray, int k){
       if(inputArray.length == 0)return;
        Arrays.sort(inputArray);
        int len = inputArray.length - 1;
        System.out.println("KthMax: "+ inputArray[len - k - 1]+" KthMin: "+ inputArray[k - 1]);
    }

    //O(n log k) : O(k)
    void findKthMaxMinUsingHeap(int[] inputArray, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int len = inputArray.length;
        for(int i=0;i<k;i++){
            maxHeap.add(inputArray[i]);
        }

        for(int i = k;i< len;i++){
            if(!maxHeap.isEmpty() && maxHeap.peek() > inputArray[i]){
                maxHeap.poll();
                maxHeap.add(inputArray[i]);
            }
        }

        System.out.println("KthMin: "+ maxHeap.peek());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            minHeap.add(inputArray[i]);
        }

        for(int i = k;i< len;i++){
            if(!minHeap.isEmpty() && minHeap.peek() < inputArray[i]){
                minHeap.poll();
                minHeap.add(inputArray[i]);
            }
        }

        System.out.println("KthMax: "+ minHeap.peek());
    }


}
