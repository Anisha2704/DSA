import java.util.Scanner;
public class Problem2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //to check whether the number is palindrome
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while(num>0){
            int lastDigit = num%10;
            rev = (rev*10) + lastDigit;
            num/=10;
        }

        if(original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palidrome");

        sc.close();
    }
}
