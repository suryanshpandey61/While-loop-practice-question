import java.util.Scanner;
public class FactorOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number =");
        int i=sc.nextInt();
        System.out.print("Enter the last no=");
        int n=sc.nextInt();
      
        while (i<n) {
            if(n%i==0){
                System.out.println(i);
            }
            i++;
        }
       
    }
}
