package array;

public class MedianOfSortedArrays {

    //O(min(log M, log N) : O(1)
    double findMedian(int[] a, int[] b) {
       int m = a.length;
       int n = b.length;
       if(m < n)return findMedian(b, a);
       int start = 0, end = m;
       int realMid = (m + n + 1)/2;
       while (start <= end){
           int leftASize = (start + end) / 2;
           int leftBSize = realMid - leftASize;
           int lA = leftASize == 0 ? Integer.MIN_VALUE : a[leftASize - 1] ;
           int lB = leftBSize == 0 ? Integer.MIN_VALUE : b[leftBSize - 1];
           int rA = leftASize == m ? Integer.MAX_VALUE : a[leftASize];
           int rB = leftBSize == n ? Integer.MAX_VALUE : b[leftBSize];

           if(lA <= rB && lB <= rA){
               if( (m + n) % 2 == 0){
                   return (Math.max(lA, lB) + Math.min(rA, rB)) / 2.0;
               }else return Math.max(lA, lB);
           }else if(lA > rB){
               end = leftASize - 1;
           }
           else start = leftASize + 1;

       }
        return 0.0;
    }
}
