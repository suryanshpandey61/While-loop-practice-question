public class CubeSum {
    public static void main(String[] args) {
        double i =1;
        double b=3;
        double sum=0;

        while(i<=100){
            sum=sum+Math.pow(i, b);
            i++;
        }
        System.out.println("Total sum of cube is :"+sum);
    }
}
