//PS3: Given an array, the task is to print every alternate element of the array from the first element.

package Day5;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Elements of original array: ");
            for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println("/nPrinting alternatives: ");
            for(int i=0; i<n; i++){
                if(i%2 == 0)
                    System.out.print(nums[i] + " ");
            }
        sc.close();
    }
}
