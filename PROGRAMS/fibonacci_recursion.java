// Printing the Nth term of the fibonacci series....


import java.util.*;
public class fibonacci_recursion{
    public static int fibo(int n){
        int f=0;
        if(n==0 || n==1){
            return n;
        }
        

        f=fibo(n-1)+fibo(n-2);
        return f;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
}