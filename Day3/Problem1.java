import java.util.Scanner;

class Problem1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //sum & product of first n natural numbers
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum=0, product=1;
        for(int i=1; i<=n; i++){
            sum+= i;
            product*= i;
        }

        System.out.println("Sum of first "+ n +" natural numbers is "+ sum);
        System.out.println("Product of first "+n + "natural numbers is "+ product);

        sc.close();
    }
}