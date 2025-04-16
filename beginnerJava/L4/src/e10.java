public class e10 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 65, 63, 2, 46, 64, -32, -7};
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k] + " ");
        }
    }
}
