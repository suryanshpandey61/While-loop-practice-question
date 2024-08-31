import java.util.Scanner;
public class RangeInSeven {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the first value==");
       int i=sc.nextInt();
       System.out.print("Enter the last value=");
       int j=sc.nextInt();
       while(i<=j){
          if(i%10==7){
            System.out.println(i);
          }
          i++;
       }
    }
}
