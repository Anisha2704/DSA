import java.util.Scanner;
class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Program for Arithmetic Progression.
        int a, d, n;

        System.out.println("enter first term: ");
        a = sc.nextInt();
        System.out.println("enter common difference: ");
        d = sc.nextInt();
        System.out.println("enter number of terms: ");
        n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print((a+i*d) +" ");
        }

        sc.close();
    }
}
