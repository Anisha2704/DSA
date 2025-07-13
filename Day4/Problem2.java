//PS2: print sum and avg of all the numbers in the array
import java.util.Scanner;

class Problem2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, i, sum=0;
        float avg;

        System.out.println("Enter number of elements in an array: ");
        n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements: ");
        for(i=0; i<n; i++){
            nums[i] = sc.nextInt();
            sum+= nums[i];
        }
        avg = sum/n;

        System.out.println("Sum of elements in the array: "+ sum);
        System.out.println("Average of elements in the array: "+ avg);

        sc.close();
    }
}
