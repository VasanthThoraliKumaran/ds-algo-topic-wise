package array;

import java.util.Arrays;

public class Sort012Array {

    //O (n) : O(1)
    void sort012Array(int[] inputArray){
        int zero= 0, one = 0, two= 0 ;

        for(int i: inputArray){
            switch (i) {
                case 0 -> zero++;
                case 1 -> one++;
                case 2 -> two++;
            }
        }

        int index = 0;
        for(int i=0;i< zero;i++){
            inputArray[index++] = 0;
        }
        int i1 = one + index;
        for(int i=index;i < i1;i++){
            inputArray[index++] = 1;
        }
        int i2 = two + index;
        for(int i=index;i < i2;i++){
            inputArray[index++] = 2;
        }
        System.out.println(Arrays.toString(inputArray));
    }
}
