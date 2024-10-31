class CheckMultipleSix{

  public static void main(String[] args){
    int i=1;
    int count=0;
    while(i<=16){
      if(i%6==0){
         System.out.println(i);
         count++;
      }
     i++;
    }
    System.out.println("The count is : "+count);
 
  }


}