public class Program3 {
    public static void main(String[] args) {
        double i=1;
        double j=i+1;
        double sum=0;

        while (i<=99) {
            sum=sum+Math.pow(i,2)*j;
            i++;
            j++;
        }
        System.out.println("Sum is :"+sum);
    }
}
