package array;

public class FindSingleDuplicate {

    //O(n) : O(1)
    int findDuplicate(int[] a){
        int dup = -1;
        for(int i=0;i<a.length;i++){
            int val = Math.abs(a[i]);
            if(a[val] < 0){
                dup = val;
                break;
            }else {
                a[val]*=-1;
            }
        }

        for(int i=0;i<a.length;i++){
            a[i] = Math.abs(a[i]);
        }

        return dup;
    }
}
