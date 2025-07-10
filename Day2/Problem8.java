class Problem8 {
    
    public static void main(String[] args) {
        int num = 5;
        int number = num;
        int factorial = 1; 
        while(num>0){
            factorial*=num;
            num--;
        }
        System.out.println("Factorial of "+ number + " is "+ factorial);
    }
}
