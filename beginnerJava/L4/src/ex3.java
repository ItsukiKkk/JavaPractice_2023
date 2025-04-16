import java.util.Arrays;
public class ex3{
    public static void main(String[] args) {
        int[][] array = {
            {6, 7, 4},
            {2, 1, 8},
            {9, 5, 3}
        };
        int rows = array.length;
        int cols = array[0].length;
        int[] flattened = new int[rows * cols];
        int index = 0;
        for (int[] row : array) {
            for (int value : row) {
                flattened[index++] = value;
            }
        }
        Arrays.sort(flattened);
        int[][] sortedArray = new int[rows][cols];
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sortedArray[i][j] = flattened[index++];
            }
        }
        for (int[] row : sortedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
