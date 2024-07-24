
public class r6 {

    int twosum(int arr[], int n, int target) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        r6 r = new r6();
        int arr[] = {7, 9, 4, 3, 2, 9, 5};
        int n = arr.length;
        int target = 12;
        System.out.println(r.twosum(arr, n, target));

    }
}
