class Problem5{
    public static void main(String[] args){

        //counting digits in a number
        int n1 = 875632;
        System.out.println("Number: "+ n1);
        int count = 0;
        while(n1>0){
            count++;
            n1/=10;
        }
        System.out.println("Digits in number: "+count);

        //counting even and odd digits in a number 
        int n2 = 99200;
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Number: "+n2);
        while(n2>0){
            int lastDigit = n2 % 10;

            if(lastDigit%2 == 0)
                evenCount++;
            else 
                oddCount++;
            n2/=10;
        }
        System.out.println("Even digits in number: "+evenCount);
        System.out.println("Odd digits in number: "+oddCount);
    }
}