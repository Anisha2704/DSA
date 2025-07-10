import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //to check whether the number is prime or not 
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if(num==1)
            System.out.println("Niether prime number nor a composite number.");

        if(num==2)
            System.out.println("Not a prime number.");

        int i = 2;
        while(i*i < num){
            if(num%i == 0){
                System.out.println(" Not a prime number");
                break;
            }
            else
                System.out.println("Prime number");
                break;            
        }

        //to print prime numbers from 1 to 100
        System.out.println("Prime numbers from 1 top 100:");
        for(int n=1; n<=100; n++){
            if(n==2)
                System.out.print(n + " ");

            int j=2;
            while(j*j < n){
                if(n%j == 0)
                    break;
                else
                {
                    System.out.print(n + " ");
                    break;
                }
            }
        }

    sc.close();
    }
}
