package array;

public class MinMergeOperationToMakePalindrome {

    //O(n) : O(1)
    int getOperationsCount(int[] a) {
        int len = a.length;
        if(len == 1)return 0;
        int i=0;
        int j=len-1;
        int count = 0;
        while (i <= j){
            if(a[i] == a[j]){
                i++;
                j--;
            }else if(a[i] > a[j]){
                j--;
                a[j]+= a[j+1];
                count++;
            }else {
                i++;
                a[i]+= a[i-1];
                count++;
            }
        }
        return count;
    }
}
