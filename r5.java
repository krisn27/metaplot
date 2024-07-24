
//linear search questions
public class r5 {

    int countoccurence(int arr[], int n, int x) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                res++;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        r5 r = new r5();
        int arr[] = {5, 5, 8, 7, 5, 34, 12, 5, 4, 5, 5};
        int n = arr.length;
        int x = 5;
        System.out.println(r.countoccurence(arr, n, x));

    }
}
