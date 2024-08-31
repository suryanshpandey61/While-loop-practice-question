public class SquareNatural {
    public static void main(String[] args) {
        double i=1;
        double b=2;
        double sum=0;

        while(i<=100){
            sum=sum+Math.pow(i, b);
            i++;
        }
        System.out.println("Sum of square natural no upto 100 is :"+sum);
    }
}
