public class Program2 {
    public static void main(String[] args) {
        double i=1;
        double j=i+1;
        double sum=0;
         while(i<=99){
            sum=sum+i*Math.pow(j, 2);
            i++;
            j++;
         }
         System.out.println("Sum of sqaure of alternate is :"+sum);
    }
}
