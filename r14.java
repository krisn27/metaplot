
public class r14 {

    static int countisland(int mat[][], int m, int n) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 'x') {
                    if ((i == 0 || mat[i - 1][j] == 'o') && (j == 0 || mat[i][j - 1] == 'o')) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int m = 6;
        int n = 3;
        int mat[][] = {{'o', 'o', 'o'},
        {'x', 'x', 'o'},
        {'x', 'x', 'o'},
        {'o', 'o', 'x'},
        {'o', 'o', 'x'},
        {'x', 'x', 'o'}
        };

        System.out.println("number of island be:" + countisland(mat, m, n));
    }
}
