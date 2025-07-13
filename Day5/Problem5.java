//PS5: Given an array of size n, the task is to check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive eqaul values and considered sorted.

package Day5;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for(int i=0; i<n-1; i++){ 
            if(nums[i] > nums[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted)
            System.out.println("yes");
        else
            System.out.println("no");

        sc.close();
    }
}
