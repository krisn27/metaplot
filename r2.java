
public class r2 {

    static int printlargestelements(int arr[], int n) {
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {7, 9, 5, 4, 3, 91, 89};
        int n = arr.length;
        System.out.println(printlargestelements(arr, n));

    }
}
