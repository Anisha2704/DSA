//LINEAR SEARCH:
//Linear Search is a simple searching algorithm that checks each element of the array or list sequentially until the desired element (target/key) is found or the list ends.

package Day7;

import java.util.Scanner;

public class Problem1 {

    public static int linearSearch(int[] nums, int key){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key)
                return i;
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

        int idx = linearSearch(nums, key);

        if(idx == -1)
            System.out.println("Not found.");
        else
            System.out.println(key + " found at index " + idx);
        sc.close();
    }
}
