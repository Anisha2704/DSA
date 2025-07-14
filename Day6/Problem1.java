//PS1: Given a sorted array of size n, the goal is to remove duplicates from a sorted array and print each unique elememt only once.

package Day6;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter the elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            if(nums[i]!=nums[i+1])
                System.out.print(nums[i]+" ");
        }
        System.out.print(nums[n-1]);
        sc.close();
    }
}
