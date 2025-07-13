//PS4: Given an array of size n, the task is to find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements to its right side.

/*
 Example1: input = [16,17,4,3,5,2], output = 17, 5, 2
 Example2: imput = [1,2,3,4,5,2], output = 5,2
 */

package Day5;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Leaders in an array: ");
        for(int i=0; i<n; i++){
            boolean isLeader = true;
            for(int j=i+1; j<n; j++){
                if(nums[i]<nums[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader)
                System.out.print(nums[i] + " ");
        }
        sc.close();
    }
    
}
