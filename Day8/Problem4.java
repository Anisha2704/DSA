//PS4: Write a program that reads an array of integers from the user and counts how many numbers in the array have an even number of digits.
/*
 Example: Input: [12, 345, 2, 6, 7896] Output: 2

 Explanation: 
 Among the numbers [12, 345, 2, 6, 7896],
 12 has 2 digits → even ✅
 345 has 3 digits → odd ❌
 2 has 1 digit → odd ❌
 6 has 1 digit → odd ❌
 7896 has 4 digits → even ✅
 Hence, the count is 2.
 */
package Day8;

import java.util.Scanner;

public class Problem4 {

    public static void evenNumbers(int[] nums){
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if(evenDigits(nums[i]))
                even++;
        }
        System.out.println(even);
    }

    public static boolean evenDigits(int num){

        int digits = (int)Math.log10(num) + 1;
        return digits%2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        evenNumbers(nums);
        sc.close();
    }
}
