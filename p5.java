
import java.util.*;

public class p5 {

    static int reversednumber(int num) {
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;

        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reversednumber(num));
    }

}
