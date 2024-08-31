public class Program1 {
    public static void main(String[] args) {
        double  i=1;
        double j=i+1;
        double sum=0;

        while (i<=99) {
            sum=sum+(i*j);
            i++;
            j++;
        }
        System.out.println("Sum is :"+sum);
    }
}
