import java.util.Scanner;
public class Problem3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //to check whether the number is armstrong
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.print("Enter number of digits: ");
        int digits = sc.nextInt();

        int original = num;
        int armstrong = 0;
        while(num > 0){
            int lastDigit = num%10;
            armstrong+= Math.pow(lastDigit,digits);
            num/=10;
        }

        if(original == armstrong)
            System.out.println("It is an Armstrong number.");
        else
            System.out.println("It is not an Armstrong number.");

        sc.close();
    }
}
