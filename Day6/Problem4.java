//PS4: Given an array with n size, the task is to print all pairs of elements in a given array.

package Day6;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hello");

        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter elements:" );
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Printing pairs in the array: ");
        for(int i=0; i<n; i++){ 
            
            for(int j=i+1; j<n; j++){ 
                System.out.print("("+nums[i]+","+nums[j]+")"+ " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
