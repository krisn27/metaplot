
import java.util.*;

public class r12 {

    static int kthsmallest(int arr[], int k) {
        Arrays.sort(arr);

        return arr[k - 1];

    }

    public static void main(String args[]) {
        int arr[] = {5, 7, 8, 2, 34, 9};
        int k = 2;
        System.out.println("kth smallest elements be:" + kthsmallest(arr, k));

    }
}
