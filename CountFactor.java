import java.util.Scanner;
public class CountFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first no=");
        int i=sc.nextInt();

        System.out.print("Enter the last number=");
        int j=sc.nextInt();

        int count=0;

        while (i<=j) {
            if(j%i==0){
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("total count is="+count);
    }
}
