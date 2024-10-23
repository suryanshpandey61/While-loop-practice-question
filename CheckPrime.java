import java.util.Scanner;
class CheckPrime{
  
  public static void  isPrime(int n){
  int count=0;
  int i=1; 
      while(i<=n)
      {
      		 if(n%i==0){
   			count++;
       		 }
            i++;
         
      } 
 
   if(count==2)
      System.out.println(n+" is a Prime Number");
   else
         System.out.println(n+" is Not a Prime Number");
 
   }

 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no to check it is prime or not: ");
  int n= sc.nextInt();
  isPrime(n);
  


 }

}










