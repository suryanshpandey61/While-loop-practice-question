import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.print("Enter the No:=");
        int n= sc.nextInt();

        int count=0;

        while(i<=n){
            if(n%i==0 && count<3){  
                count++;
            }
            i++;
        }
        if(count<=2){
            System.out.println(n+" Is a prime no");
        }
        else{
            System.out.println(n+" Is Not a Prime no");
        }
    }
    
}
