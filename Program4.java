public class Program4 {
    public static void main(String[] args) {
        double i=1;
        double sum=0;

        while (i<=100) {
            sum=sum+(1/i);
            i++;
        }
        System.out.println("Sum of Simple Fraction is : "+sum);
    }
}
