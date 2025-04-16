
public class ex1 {
    public static void main(String[] args) {
        int[] a = {67, 89, 69, 90, 100, 75, 90};

        int min = a[0]; 
        int max = a[0]; 

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
    }
}
