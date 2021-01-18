/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computefibonacci;

import java.util.Scanner;

/**
 *
 * @author Isaiah J
 */
public class ComputeFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanne
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
    }

    private static long fib(long index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }
}
