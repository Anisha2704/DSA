//Given a 2D array where each row represents a customer and each column represents the amount of money they have in different bank accounts, write a program to determine the maximum wealth possessed by any customer.
/*
 Example: Input: [[1,2,3],[3,2,1],[4,3,2]] Output: 9

 Explanation:
 Customer 1: 1 + 2 + 3 = 6
 Customer 2: 3 + 2 + 1 = 6
 Customer 3: 4 + 3 + 2 = 9
 → Maximum wealth = 9
 */
package Day8;

import java.util.Scanner;

public class Problem5 {

    public static int maxWealth(int[][] nums){
        int max = 0;
        for(int i=0; i<nums.length; i++){
            int wealth = 0;
            for(int j=0; j<nums[i].length; j++){
                wealth+= nums[i][j];
            }
            if(max<wealth)
                max = wealth;
        }
        return max;
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

        int wealth = maxWealth(nums);
        System.out.println("Maximum Wealth: " + wealth);

        sc.close();
    }
}
