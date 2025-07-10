class Problem2{
    public static void main(String[] args){

        //Swap two numbers
        System.out.println("1.using temporary variable");
        int n1=5, n2=10;
        System.out.println("Numbers before swapping: n1="+ n1 + " n2=" + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("Numbers after swapping: n1="+ n1 + " n2=" + n2);
        System.out.println();

        //without temp

        //1. using additon & substraction
        System.out.println("2.using additon & substraction");
        int n3=16, n4=27;
        System.out.println("Numbers before swapping: n3="+ n3 + " n4=" + n4);
        n3 = n3+n4;
        n4 = n3-n4;
        n3 = n3-n4;
        System.out.println("Numbers after swapping: n3="+ n3 + " n4=" + n4);
        System.out.println();

        //2.using division and multiplication
        System.out.println("3.using division and multiplication");
        int n5=21, n6=22;
        System.out.println("Numbers before swapping: n5="+ n5 + " n6=" + n6);
        n3 = n3*n4;
        n4 = n3/n4;
        n3 = n3/n4;
        System.out.println("Numbers after swapping: n5="+ n5 + " n6=" + n6);
        System.out.println();

        //using x-or(^) operator
        System.out.println("4.using x-or(^) operator");
         int n7=111, n8=55;
        System.out.println("Numbers before swapping: n7="+ n7 + " n8=" + n8);
        n7 = n7^n8;
        n8 = n7^n8;
        n7 = n7^n8;
        System.out.println("Numbers after swapping: n7="+ n7 + " n8=" + n8);
    } 
}