
public class reverse {

    static void reverse(int arr[], int start, int end) {
        int temp;

        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 7, 9, 4};
        int n = arr.length;
        printarray(arr, n);
        reverse(arr, 0, 4);
        printarray(arr, n);

    }

}
