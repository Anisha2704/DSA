import java.util.Scanner;

class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Factorial series between range m to n.
        System.out.print("Enter Starting point: ");
        int m = sc.nextInt();

        System.out.print("Enter ending point: ");
        int n = sc.nextInt();

        for(int i=m; i<=n; i++){
            int num = i;
            int fact=1;
            while(num>0){
                fact*= num;
                num--;
            }
            System.out.print(fact + " ");
        }

        sc.close();
    }
}
