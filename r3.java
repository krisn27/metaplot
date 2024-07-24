
import java.util.*;

public class r3 {

    static void move(int arr[]) {
        Arrays.sort(arr);

    }

    public static void main(String[] args) {
        int arr[] = {-1, -2, 3, 5, 7, 91, -6};
        move(arr);
        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i]);
        }

    }
}
