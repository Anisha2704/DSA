//PS1: Search a target element in 2d array.

package Day8;

import java.util.Scanner;

public class Problem2{

    public static int[] search2D(int[][] nums,int target){

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] == target)
                return new int[] {i,j};
            }
        }

        return new int[] {-1,-1};  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and cols:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] nums = new int[row][col];
        System.out.println("Enter elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                nums[i][j] = sc.nextInt();
            }  
        }

        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        int[] res = search2D(nums, target);

        if(res[0] == -1)
            System.out.println("Target not found.");
        else
            System.out.println("[" + res[0] + "," + res[1] + "]");

        sc.close();
    }
}