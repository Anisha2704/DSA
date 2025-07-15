//BINARY SEARCH:
//Binary Search is an efficient algorithm that repeatedly divides the search interval in half to locate a target value in a sorted array.

package Day7;

import java.util.Scanner;

public class Problem2 {

    public static int binarySearch(int[] nums, int key){

        int start=0, end=nums.length-1; 
         // 

        while(start <= end){
            int mid = (start + end)/2; 

            if(nums[mid] == key)
                return mid;
            else if(key < nums[mid])
                 end = mid;
            else
                start = mid+1;
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("enter the element you want to search for: ");
        int key = sc.nextInt();

        int idx = binarySearch(nums, key);

        if(idx == -1)
            System.out.println("Not found.");
        else
            System.out.println(key + " found at index " + idx);
        sc.close();
    }
}
