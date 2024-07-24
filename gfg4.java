
public class gfg4 {

    static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 9, 4, 8};
        int n = arr.length;
        printarray(arr, n);

    }

}
