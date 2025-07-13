//PS1: Insert a given element at a specific position in an array and display the array.

package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    
    public static void insertion(int[] arr){
        Scanner sc = new Scanner(System.in);
        int size = arr.length;
        int [] arr2 = new int[size+1];

        System.out.println("enter the position where you want to insert a new element:");
        int pos = sc.nextInt();
        System.out.println("enter the element:");
        int ele = sc.nextInt();

        int idx= pos-1;
        for(int i=0; i<size+1; i++){
            if(i<idx)
                arr2[i] = arr[i];
            else if(i==idx)
                arr2[i] = ele;
            else
                arr2[i] = arr[i-1];
            
        }

        System.out.println("element inserted successfully: "+Arrays.toString(arr2));

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
        insertion(arr);

        sc.close();
    }

}
