class CheckMultipleNine{

  public static void main(String[] args){
    int i=1;
    int count=0;
    while(i<=100){
      if(i%9==0){
         System.out.println(i);
         count++;
      }
     i++;
    }
    System.out.println("The count is : "+count);
 
  }


}