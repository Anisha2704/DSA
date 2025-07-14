//PS3: Given an array of integers and a number d, the task is to rotate the elements of the array to the right by d positions.
/* 
Example: Input = [1,2,3,4,5,6] , d = 2
        Output = [6,5,1,2,3,4]
*/

package Day6;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter elements:" );
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("enter d: ");
        int d = sc.nextInt();

        while(d>0){
            int temp = nums[n-1];
            for(int i=n-1; i>0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            d--;
        }

        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}
