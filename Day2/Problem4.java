import java.util.Scanner;
public class Problem4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //to check whether the number is spy
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int sum = 0, product = 1;

        while(num > 0){
        int lastDigit = num%10;
        sum+= lastDigit;
        product*= lastDigit;
        num/=10;
        }

        if(sum==product)
            System.out.println("It is a Spy number.");
        else
            System.out.println("It is not a Spy number.");
        
        sc.close();
    }
}
