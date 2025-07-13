//PS1: take an array input and find minimum and maximum number from it.

import java.util.Scanner;
class Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, min=0, max=0;

        System.out.println("enter number of elememts: ");
        n = sc.nextInt();

        int[] nums = new int[n];
        
        System.out.println("enter elememts of array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt(); 
        }

            min = nums[0];
            max = nums[0]; 
        
        for(int i=1; i<n; i++){

            if(min > nums[i])
                min = nums[i]; 

            if(max < nums[i])
                max = nums[i];

        }
        System.out.println("Minimum number: "+ min);
        System.out.println("Maximum number: "+ max);

        sc.close();
    }
}
