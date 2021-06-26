package fibonacciseries;

import java.util.Scanner;


public class FibonacciSeries {

    
    public static void main(String[] args) {
        int x=0,y=1,z,n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many terms should be printed:");
        n=s.nextInt();
        System.out.print(x+" "+y);
        for(i=1;i<=n-2;i++)
        {
            z=x+y;
            System.out.print(" "+z);
            x=y;
            y=z;
        }
    }
    
}
