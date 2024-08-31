public class QuadSum {
    public static void main(String[] args) {
        double i=1;
        double b=4;
        double sum=0;

        while (i<=100) {
            sum=sum+Math.pow(i,b);
            i++;
        }
        System.out.println("The sum of quad no is :"+sum);
    }
}
