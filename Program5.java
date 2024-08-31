public class Program5 {
    public static void main(String[] args) {
        double i=1;
        double sum=0;
        while (i<=2) {
            sum=sum+1/(Math.pow(i, 2));
            i++;
        }
        System.out.println("Sum is : "+sum);
    }
}
