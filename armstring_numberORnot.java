/* 
number is armstrong or not. ARMSTRONG MEANS -->  
An n-digit number that is the sum of the nth powers of its digits is called an n-narcissistic number. It is also sometimes known as an Armstrong number, perfect digital invariant (Madachy 1979), or plus perfect number. Hardy (1993) wrote, "There are just four numbers, after unity, which are the sums of the cubes of their digits: 153=1^3+5^3+3^3, 370=3^3+7^3+0^3, 371=3^3+7^3+1^3, and 407=4^3+0^3+7^3. These are odd facts, very suitable for puzzle columns and likely to amuse amateurs, but there is nothing in them which appeals to the mathematician." Narcissistic numbers therefore generalize these "unappealing" numbers to other powers (Madachy 1979, p. 164). 

The smallest example of a armstrong number other than the trivial 1-digit numbers is

153=1^3+5^3+3^3. 	
(1)
The first few are given by 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 
*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.applet.*;

public class armstring_numberORnot {
    public static void main(String[] args) {
        while (true) {
            String num;
            System.out.print("\nEnter a number to know it's armstrong or not:");
            Scanner a = new Scanner(System.in);
            num = a.nextLine();
            int length = num.length();
            int sum = 0;
            for (int i = 0; i < length; i++) {
                char ch = num.charAt(i);
                int num2 = ch - '0'; // here the ascii value get minus 1-> 49, 0-> 48, ==> (49-48)=1
                int num3 = 1;
                // here we multiply (n^number of digit) n times for every single digit
                for (int j = 1; j <= length; j++) {
                    // here we get multiplication of each number like if for number 153 ==> 1=1*1*1
                    // -> 1, or 5=5*5*5 -> 125 , or 3=3*3*3=27
                    num3 = num2 * num3;
                }
                // here we sum each number like sum =1+125+24 => 153
                sum = num3 + sum;
            }
            // converting the string input number so that we can compare with the integer
            // value we got
            int actualnum = Integer.parseInt(num);
            // here if the sum that is sum=153 is equal to input from user num=153 then the
            // number is armstrong
            if (sum == actualnum) {
                System.out.println("Armstrong of >> " + num + " >> " + sum + " >> so its a ARMSTRONG NUMBER .....:)");
            }
            // if sum!=num then its not armstrong number
            else {
                System.out
                        .println("Armstrong of >> " + num + " >> " + sum + " >> so its not a ARMSTRONG NUMBER .....:)");
            }
        }
    }
}

/*
 * Enter a number to know it's armstrong or not:1
 * Armstrong of >> 1 >> 1 >> so its a ARMSTRONG NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:2
 * Armstrong of >> 2 >> 2 >> so its a ARMSTRONG NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:153
 * Armstrong of >> 153 >> 153 >> so its a ARMSTRONG NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:155
 * Armstrong of >> 155 >> 251 >> so its not a ARMSTRONG NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:370
 * Armstrong of >> 370 >> 370 >> so its a ARMSTRONG NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:371
 * Armstrong of >> 371 >> 371 >> so its a ARMSTRONG NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:407
 * Armstrong of >> 407 >> 407 >> so its a ARMSTRONG NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:1634
 * Armstrong of >> 1634 >> 1634 >> so its a ARMSTRONG NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:1635
 * Armstrong of >> 1635 >> 2003 >> so its not a ARMSTRONG
 * NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:563
 * Armstrong of >> 563 >> 368 >> so its not a ARMSTRONG NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:5208
 * Armstrong of >> 5208 >> 4737 >> so its not a ARMSTRONG
 * NUMBER .....:)
 * 
 * Enter a number to know it's armstrong or not:8028
 * Armstrong of >> 8028 >> 8208 >> so its not a ARMSTRONG
 * NUMBER .....:)
 * 
 */