
public class r17 {

    public static void main(String[] args) {
        try {
            int a = 50 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("cant divisible of zero");
        }finally{
        System.out.println("rest of code");
        }

    }
}
