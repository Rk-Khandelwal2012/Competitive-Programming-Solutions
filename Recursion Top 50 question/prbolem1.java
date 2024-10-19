class pb{
    public static int printNumber(int n){
        if(n==1){
            System.out.println("1");
            return 0;

        }
        else{
            
            printNumber(n-1);
            System.out.println(n);
        }
        return 0;
    }
    public static int printNumber2(int n){
        if(n==1){
            System.out.print("1");
            return 0;

        }
        else{
            System.out.print(n);
            printNumber(n-1);
         
        }
        return 0;
    }
}