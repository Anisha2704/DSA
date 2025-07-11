class Problem3 {
    
    public static void main(String[] args){

        //print tribonacci series upto 100.
        int a=0, b=1, c=1, d;
        System.out.print(a + " " + b + " " + c + " ");
        for( ; ; ){
            d = a+b+c;
            if(d<=100)
            {
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
            }
            else
                break;
        }
    }
}
