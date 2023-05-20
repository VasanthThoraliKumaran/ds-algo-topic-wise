package array;

public class MedianOfSortedArraySameSize {

     private int findUpperBound(int[] arr, int key){
         int l = 0, h = arr.length-1;
         while (l <= h){
             int mid = l + ((h - l) >> 2);
             if(arr[mid] <= key){
                 l = mid + 1;
             }else h = mid - 1;

         }
         return l;
     }
     private double findMedian(int[] a1, int[] a2, int n, int pos){
         int l = (int)-1e9, h = (int)1e9;
         while (l <= h){
             int mid = l + ((h - l) >> 2);

             int ub = findUpperBound(a1, mid) + findUpperBound(a2, mid);

             if(ub <= pos){
                 l = mid + 1;
             }else h = mid - 1;
         }

         return l;
     }

     //O(log n)^2 : O(1)
     double getMedian(int[] a1, int[] a2, int n) {
         return (findMedian(a1, a2, n, n) + findMedian(a1, a2, n, n-1)) / 2.0;
     }

     // O(n) : O(1)
     double getMedianLinear(int[] a, int[] b, int n) {
         int i=0, j=0;
         int c = 0;
         int m1 = 0, m2 = 0;
         while (c++ < n) {
             if(i == n){
                 m1 = m2;
                 m2 = b[j];
                 break;
             }
             if(j == n){
                 m1 = m2;
                 m2 = a[i];
                 break;
             }
             if(a[i] <= b[j]){
                 m1 = m2;
                 m2 = a[i];
                 i++;
             }else {
                 m1 = m2;
                 m2 = b[j];
                 j++;
             }
         }

         return (m1 + m2) / 2.0;
     }


}
