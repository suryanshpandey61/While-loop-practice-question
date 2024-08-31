import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number := ");
        double n=sc.nextDouble();
       double fact= getFactorial(n);
       System.out.println("The factorial of "+n+" is "+fact);
        
    }
    public static double getFactorial(double n){
        double i=1;
        double fact=0;
        while (i<n) {
             fact=n*(n-i);
             i++;
        }
        return fact;
    }
}
