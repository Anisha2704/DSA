import java.util.Scanner;

class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Square Number Series of first n natural numbers.
        int n ;

        System.out.println("enter number of terms: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i*i + " ");
        }

        sc.close();
    }
}
