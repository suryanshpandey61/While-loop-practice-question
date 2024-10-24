class PrintOddDigit{

  public static void printOddDigit(){
   int i=1;
   while(i<=100){
     if(i%2!=0){
       System.out.println(i);
     }
    i++;
 
   }

  } 
 
  public static void main(String[] args){
    System.out.println("Main Starts");
    printOddDigit();
    System.out.println("Main Ends");
  }
 

}