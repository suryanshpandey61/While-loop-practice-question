import java.util.Scanner;
class NewProgram{
   
  public static int getSumBetween(int start,int end){
     int i=start;
     int sum=0;
     while(i<=end){
         sum=sum+i;
         i++;
     }
     return sum;

  }

 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the start number ");
   int start=sc.nextInt();
   System.out.println("Enter the end number ");
   int end=sc.nextInt();
   int result=getSumBetween(start,end);
   System.out.println("The sum of range from "+start+ " & " +end+ " is : = "+result);

 }

}