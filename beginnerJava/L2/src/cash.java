import java.util.Scanner;
public class cash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�����빺���");
        double buy = scanner.nextDouble();
        System.out.print("������֧����");
        double pay = scanner.nextDouble();
        scanner.close();
        double cash = pay - buy;
        System.out.println("�һ���Ǯ��" + cash);
    }
}

