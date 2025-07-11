class Problem9 {
    public static long factorial(int n){
        long fact = 1;
        while(n>0)
        {
            fact*=n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args){

        //catalan series upto 10.
        int n=0;
        while(n<=10){
        long fact_2n = factorial(2*n);
        long fact_n1 = factorial(n+1);
        long fact_n = factorial(n);

        long catalan = fact_2n / (fact_n1*fact_n);
        System.out.print(catalan + " ");
            n++;
        }
    }
}
