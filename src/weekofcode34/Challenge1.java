/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//One day, Jack was going home by tram. When he got his ticket, he noticed that number on the ticket was not lucky. A lucky ticket is a six-digit number on the ticket in which sum of the first three digits is equal to the sum of the last three digits.
//
//For example, number 165912 is lucky because sum of1+6+5=12 , and 9+1+2=12.
//
//Since the number on the ticket wasn't lucky, Jack needs your help to find the next lucky ticket number.
//
//For example, if Jack's ticket number is 165901, then the next lucky ticket number is 165903.
//
//Given Jack's current ticket number, find and print the next lucky ticket number.
//Input Format
//
//The first line contains an integer, x, denoting the 6-digit number on the ticket.
//
//Constraints
//
//Output Format
//
//For the given input find and print the next lucky ticket number.
//Sample Input 0: 555555
//Sample Output 0: 555564


package weekofcode34;

import java.util.Scanner;

/**
 *
 * @author Vineet
 */
public class Challenge1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String currentTicket = in.next();
        if (currentTicket.length() > 6) {
            System.out.println(currentTicket);
        } else {
            int mid = 0;
            String modCurrentTicket = "";
            mid = currentTicket.length() / 2;

            modCurrentTicket = currentTicket.substring(0, mid);
            int oldTicket = Integer.parseInt(currentTicket);
            int currentSum = 0;
            int nextSum = 0;
            for (char c : modCurrentTicket.toCharArray()) {
                currentSum = currentSum + Integer.parseInt("" + c);
            }

            //finding next lucky ticket
            int a = 1;
            String newwala = "";
            while (a > 0) {
                nextSum = 0;
                oldTicket = oldTicket + 1;
                newwala = "" + oldTicket;
                String newwala2 = newwala.substring(mid, 6);
                for (char c : newwala2.toCharArray()) {
                    nextSum = nextSum + Integer.parseInt("" + c);
                }
                if (currentSum == nextSum) {
                    a = -1;
                }
            }

            if (newwala.length() > 6) {
                System.out.println(currentTicket);
            } else {
                System.out.println(newwala);
            }

        }
    }

}
