class PrintEvenDigit{

  public static void printEvenDigit(){
   int i=1;
   while(i<=100){
     if(i%2==0){
       System.out.println(i);
     }
    i++;
 
   }

  } 
 
  public static void main(String[] args){
    System.out.println("Main Starts");
    printEvenDigit();
    System.out.println("Main Ends");
  }
 

}