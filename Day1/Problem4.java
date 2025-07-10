class Problem4{
    public static void main(String[] args){

        //printing digits in a number in reverse order
        System.out.println("Printing digits in reversre order: ");
        int n1= 12345;
        while(n1>0){
            System.out.println(n1%10);
            n1/=10;
        }

        //printing numbers in Straight order 
        System.out.println("Printing digits in straight order: ");
        int n2= 24359, k=5;
        while(n2>0){
            int digit = (int)(n2/(Math.pow(10,k-1)));
            System.out.println(digit);
            n2 = (int)(n2%(Math.pow(10,k-1)));
            k--;
        }
    }
}