/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekofcode34;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Vineet
 */
public class Challenge2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for (int B_i = 0; B_i < n; B_i++) {
            B[B_i] = in.nextInt();
        }

        int prevGCD = 0;
        int prevSum = 0;
        int prevFirstValue = 0;
        int prevSecondValue = 0;

        for (int i : A) {
            for (int j : B) {
                int gcd = getGCD(i, j);
                if (gcd >= prevGCD) {
                    int currentSum = i + j;
                    prevSum = currentSum;
                    if (currentSum >= prevSum) {
                        prevGCD = gcd;
                        prevFirstValue = i;
                        prevSecondValue = j;
                    }
                }
            }
        }
        System.out.println(prevSum);
    }

    public static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }

}
