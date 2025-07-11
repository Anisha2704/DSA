class Problem2 {
   public static void main(String[] args){

    //printing first 20 numbers of fibonacci series
    int a=0, b=1, c;
    System.out.print(a + " " + b + " ");
    int count = 2;

    while(count<20){
        c = a+b;
        System.out.print(c + " ");
        a = b;
        b = c;
        count++;
    }
   }
}
