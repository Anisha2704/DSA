//JUMP SEARCH
//Jump Search is a searching algorithm for sorted arrays. It checks elements at fixed intervals (or "jumps") and then performs a linear search in a smaller block when the target might be found.

package Day7;

import java.util.Scanner;

public class Problem3 {

    public static int  jumpSearch(int[] nums, int key){  
        int jump = (int) Math.sqrt(nums.length); 

        int start=0, end= start+jump-1; 

        while(start < nums.length && nums[start] <= key){
            if(nums[start] == key){
                return start;
            }
            start+= jump;
            end+= jump;
        }

        if(start >= nums.length){
        start-= jump;
        end= nums.length-1;
        }
        else{
            end-= jump;
        }


        for(int i=start; i<=end; i++){
            if(nums[i] == key)
                return i;
        }

    return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter no. of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("enter the element you want to search for: ");
        int key = sc.nextInt();

        int idx = jumpSearch(nums, key);

        if(idx == -1)
            System.out.println("Not found.");
        else
            System.out.println(key + " found at index " + idx);
        sc.close();
    }
}
