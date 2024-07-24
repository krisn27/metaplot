
import java.util.Arrays;
import java.util.Collections;

public class r13 {

    static void sort(Integer arr[]) {
        Arrays.sort(arr, Collections.reverseOrder());
    }

    public static void main(String args[]) {
        Integer arr[] = {6, 8, 4, 0, 2, 3, 0, 9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
