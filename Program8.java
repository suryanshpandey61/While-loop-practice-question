public class Program8 {
    public static void main(String[] args) {
        double i=1;
        double j=2;
        double sum=0;

        while (i<=99) {
            sum=sum+1/(i*j);
            i++;
            j++;
        }
        System.out.println("Sum of alternative multiplication : "+sum);
    }
}
