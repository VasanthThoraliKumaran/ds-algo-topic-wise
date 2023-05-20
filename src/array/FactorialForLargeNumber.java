package array;

import java.math.BigInteger;

public class FactorialForLargeNumber {

    //O(N log N!) : (max(digits in factorial)
     void factorial(int num){
        int[] res = new int[500];
        res[0] = 1;
        int res_size = 1;
        for (int i = 2; i < num; i++) {
            res_size = multiply(i, res, res_size);
        }

        for (int i = res_size - 1; i > - 1 ; i--) {
            System.out.print(res[i]);
        }

        System.out.println();
    }

    private int multiply(int x, int[] res, int res_size){
        int carry = 0;
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0){
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }

        return res_size;
    }

    //O(N) : O(1)
    BigInteger factorialUsingBigInt(int N)
    {
        // Initialize result
        BigInteger f
                = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }

}
