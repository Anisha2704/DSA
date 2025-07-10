class Problem1 {
    
    public static void main(String[] args){

    //to fetch last digit from a number
    int num = 1234;
    int last_digit = num%10;
    System.out.println(num);
    System.out.println(last_digit);

    //to fetch last 2 numbers from a number
    int ld_2 = num%100;
    System.out.println(ld_2);

    //to fetch last 3 numbers from a number
    int ld_3 = num%1000;
    System.out.println(ld_3);

    //to remove last digit from a number
    int num2 = 5678;
    int new_num = num2/10;
    System.out.println(num2);
    System.out.println(new_num);

    //to remove last 2 numbers from a number
    int new2 = num2/100;
    System.out.println(new2);

    //to remove last 2 numbers from a number
    int new3 = num2/1000;
    System.out.println(new3);

    }
}