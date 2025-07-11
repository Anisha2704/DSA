import java.util.Scanner;

class Problem5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         //Program for Geometric Progression.
        int a, r, n;

        System.out.println("enter first term: ");
        a = sc.nextInt();
        System.out.println("enter common difference: ");
        r = sc.nextInt();
        System.out.println("enter number of terms: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num = (int)(a*Math.pow(r, i));
            System.out.print(num +" ");
        }

        sc.close();
    }
}
