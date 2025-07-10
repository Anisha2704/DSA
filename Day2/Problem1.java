class Problem1 {
    
    public static void main(String[] args){

        //reverse a number
        int num = 5472, rev=0;
        while(num>0){
            int lastDigit = num%10;
            rev = (rev*10) + lastDigit;
            num/=10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
