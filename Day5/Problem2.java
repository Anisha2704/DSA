//PS2: Delete a given element at a specific position in an array and display the updated array.

package Day5;

import java.util.*;

public class Problem2 {

    public static void deletion(int[] arr){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the position of the element to delete: ");
        int pos = sc.nextInt(); 

        int idx = pos-1; 
        for(int i=0; i<arr.length; i++){
            if(i>idx)
                arr[i-1] = arr[i]; 
        }

        System.out.print("updated array: [");
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");

        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("elements added into the array: " + Arrays.toString(arr));
        deletion(arr);

        sc.close();
    }
    
}
