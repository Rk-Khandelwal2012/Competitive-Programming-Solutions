import java.util.Scanner;

public class reverseFibonacci {
    public static int  series(int n){
        if(n==0){
             return 0;}
        if(n==1 || n==2){
            return 1;
        }
        else{
            return ((series(n-1)+series(n-2)));
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number of terms");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            System.out.print(series(i)+" ");
        }
    }
}
