package Muluneh;
import java.util.Arrays;
public class Average {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));

    }

    static int reverse(int x) {
        int sum = Integer.MIN_VALUE;
        int temp = 0;
        while (x !=0) {
            temp = x % 10;
            sum = sum * 10 +temp;
            x = x / 10;
        }
        return sum;
    }
}
