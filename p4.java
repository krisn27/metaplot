
import java.util.*;

public class p4 {

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
        System.out.println("enter the number");
        int num = sc.nextInt();
        int reverse_n = reversednumber(num);
        if (num == reverse_n) {
            System.out.println("the number is palidrome");
        } else {
            System.out.println("the number is not plaidrome number");
        }

    }

}
