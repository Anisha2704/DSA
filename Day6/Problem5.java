/*
PS5: write a program to: 1.print all possible sub-arrays of a given array.
                           2.print the sum of each sub-array. 
                           3. find the Maximum and Minimum sum among all the sub-arrays.
*/

package Day6;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter elements:" );
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Printing Subarrays: ");
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, sum;
        for(int i=0; i<n; i++){  
            for(int j=i; j<n; j++){ 
                sum = 0;
                for(int k=i; k<=j; k++){  
                    System.out.print(nums[k] + " ");
                    sum+= nums[k];
                }
                System.out.println(" Sum of the sub-array: "+ sum);
                if(min > sum)
                    min = sum;
                if(max < sum)
                    max = sum;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum sum of the sub-array: " + max);
        System.out.println("Minimum sum of the sub-array: " + min);
        sc.close();
    }
}
