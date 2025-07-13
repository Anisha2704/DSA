//PS4: Reverse the array;

import java.util.Arrays;
import java.util.Scanner;

class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i;

        System.out.println("Enter number of elements in an array: ");
        n = sc.nextInt();

        int[] nums = new int[n];
        int[] rev = new int[n];

        int idx= n-1;
        System.out.println("Enter elements: ");
        for(i=0; i<n; i++){
            nums[i] = sc.nextInt();
            rev[idx] = nums[i];
            idx--;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(rev));

        sc.close();
    }
}
