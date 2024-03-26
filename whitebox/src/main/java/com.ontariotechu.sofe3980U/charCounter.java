package com.ontariotechu.sofe3980U;

import java.util.Scanner;

public class charCounter {
    // function to do the counting
    public static int count(char[] arr, char target) {
        int count = 0;

        // runs through each element of the array and checks if it equals to the target character
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // initializes variables to be used
        Scanner input = new Scanner(System.in);
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'j'};

        // asks user for character to check within the character array
        System.out.println("Please choose a character to check in the array: ");
        char target = input.next().charAt(0);

        // calls for counting function with required parameters
        int counter = count(arr, target);

        // prints out result
        System.out.println("Your letter showed up " + counter + " times");

    }
}
