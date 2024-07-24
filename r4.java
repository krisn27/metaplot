
public class r4 {

    public static void sort(int arr[], int n) {
        int i, j;
        int temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {4, 8, 9, 3, 2, 18, 9};
        int n = arr.length;
        sort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
