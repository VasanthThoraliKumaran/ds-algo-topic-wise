package array;

public class ReverseArray {

    //O(start+end) => O(log n) : O(1)
    public void reverse(int[] inputArray, int start, int end){
        int temp;
        while(start < end){
            temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;
        }
    }
}
