//PS2: Given an array of integers, the task is to move all the zeros to the end of the array.

package Day6;

import java.util.*;

public class Problem2 {

    public static void moveZeros(int[] arr){
        int size = arr.length;
        for(int i=0; i<size; i++){
            if(arr[i] == 0){
                int temp = arr[i];
                for(int j=i; j<size-1; j++){
                    arr[j] = arr[j+1];
                }
                arr[size-1]=temp;
                size--;
                i--;
            }
        }

        System.out.println("After moving zeros to end: "+ Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter all elements");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Original Array: "+ Arrays.toString(nums));

        moveZeros(nums);
        sc.close();
    }
}
