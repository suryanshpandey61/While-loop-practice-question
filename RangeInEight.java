public class RangeInEight {
    public static void main(String[] args) {
        int i=1;
        while (i<=1000) {
            if (i%10==8 && i%8==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
