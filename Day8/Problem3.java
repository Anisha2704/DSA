//PS3: Count the occurence of the target element.

package Day8;

import java.util.Scanner;

public class Problem3 {

    public static int occurence(int[] nums, int target){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target)
                count++;
        }
        return count;
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

        System.out.println("Enter Target element: ");
        int target = sc.nextInt();
        
        int occ = occurence(nums, target);
        System.out.println(target + " is repeated " + occ + " times.");

        sc.close();
    }
}
