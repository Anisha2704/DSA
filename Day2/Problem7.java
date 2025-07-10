class Problem7 {
    
    public static void main(String[] args) {
        
        //to check whethe the number is perfect number.
        int num = 6;
        int sum = 0;

        for(int i=1; i<num; i++){
            if(num%i == 0)
                sum+=i;
        }

        if(num == sum)
            System.out.println(num + " is a perfect number.");
        else
            System.out.println(num + " is a not perfect number.");


    //printing perfect between from 1 to 100.
    System.out.println("Perfect numbers between 1 to 100.");
    for(int n=1; n<=100; n++){ 
        int s =0; 
        for(int i=1; i<n; i++){ 
            if(n%i == 0){
                s+=i;
            }
        }
        if(n==s)
            System.out.print(n+" ");
    }
}
}
