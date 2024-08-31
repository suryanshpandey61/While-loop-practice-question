public class Program6 {
    public static void main(String[] args) {
        double i=1;
        double j=2;
        double sum=0;
        while (i<=99) {
            sum=sum+(i-j);
            i=i+2;
            j=j+2;
        }
        System.out.println("Sum of alternate add sub is : "+sum);
    }
}
