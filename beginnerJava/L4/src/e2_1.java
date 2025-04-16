
public class e2_1 {
    public static void main(String[] args) {
        int[][] a = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };
        int[][] b = {
            {10, 11, 22},
            {33, 44, 55},
            {66, 27, 19}
        };

        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
