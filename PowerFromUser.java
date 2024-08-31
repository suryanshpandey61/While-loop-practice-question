import java.util.Scanner;
public class PowerFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base value:=");
        int a=sc.nextInt();
        System.out.print("Enter the power value :=");
        int b=sc.nextInt();

        double result=Math.pow(a, b);
        System.out.println("The calculation of power is  : "+result);
    }
}
