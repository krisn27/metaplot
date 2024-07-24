
import java.util.*;

public class gfg3 {

    static void Sort(int arr[]) {
        Arrays.sort(arr);
    }

    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        int arr[] = {4, 8, 7, 6, 4, 9};
        int n = arr.length;
        print(arr, n);
        Sort(arr);
        print(arr, n);

    }

}
