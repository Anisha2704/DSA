//PS1: Search a given character in a string.

package Day8;

import java.util.Scanner;

public class Problem1 {

    public static int search(String str, char ch){
        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char ch;

        System.out.println("Enter String: ");
        str = sc.nextLine();

        System.out.println("Enter character to search: ");
        ch = sc.next().charAt(0);
    
        int res = search(str,ch);
        
        if(res == -1){
            System.out.println("Not found!");
        }
        else{
            System.out.println("Found at index " + res);
        }
        sc.close();
    }
}
