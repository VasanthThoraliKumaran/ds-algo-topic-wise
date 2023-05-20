package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UnionAndIntersection {


    //O(m + n) : O(1)
    private void findUnion(int[] arr1, int[] arr2){
        int i = 0, j = 0, m = arr1.length, n = arr2.length;
        ArrayList<Integer> aList = new ArrayList<>();
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                aList.add(arr1[i++]);
            else if (arr2[j] < arr1[i])
                aList.add(arr2[j++]);
            else {
                aList.add(arr2[j]);
                int ele = arr1[i];
                while (i< m && arr1[i] == ele) {i++;}
                while (j < n && arr2[j] == ele) {j++;}
            }
            }

        /* Print remaining elements of
         the larger array */
        while (i < m)
            aList.add(arr1[i++]);

        while (j < n)
            aList.add(arr2[j++]);

        System.out.println(aList);
    }

    //O(m + n) : O(max(log m, log n))
    private void findIntersection(int[] arr1, int[] arr2){
        Set<Integer> set = new TreeSet<>();
        ArrayList<Integer> resSet = new ArrayList<>();
        for (int i1 : arr1) {
            set.add(i1);
        }

        for(int i2: arr2){
            if(set.contains(i2)){
                resSet.add(i2);
            }
        }

        System.out.println(resSet);
    }


    void findUnionAndIntersection(int[] a1, int[] a2){
        findUnion(a1, a2);
        findIntersection(a1, a2);
    }
}
