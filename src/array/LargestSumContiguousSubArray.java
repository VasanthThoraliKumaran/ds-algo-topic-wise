package array;

public class LargestSumContiguousSubArray {

      //O(n) : O(1)
      void largestSumContiguousSubArray(int[] arr) {
          int max_Ending_Here = 0;
          int max_So_Far = Integer.MIN_VALUE;
          int start = 0, end = 0, s = 0;
          int len = arr.length;
          for(int i=0;i< len;i++){
              max_Ending_Here += arr[i];

              if(max_So_Far < max_Ending_Here){
                  max_So_Far = max_Ending_Here;
                  start = s;
                  end = i;
              }

              if(max_Ending_Here < 0){
                  max_Ending_Here = 0;
                  s = i + 1;
              }
          }

          System.out.println("MaxSum: "+ max_So_Far+" s:- "+start+" e:- "+end);
      }

      // 1 -4 2 3 -3
}
