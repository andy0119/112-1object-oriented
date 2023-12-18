import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        int x1 = 0;
        int[] mon = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入哪年: ");
        int year = scanner.nextInt();

        System.out.print("請輸入哪月: ");
        int months = scanner.nextInt();

        System.out.print("請輸入哪日: ");
        int day = scanner.nextInt();

        for (int i = 0; i < months - 1; i++)
            x1 += mon[i];

        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && months > 2)
            System.out.print(year + "年" + months + "月" + day + "日" + "是一年的第" + (x1 + day + 1) + "天");
        else
            System.out.print(year + "年" + months + "月" + day + "日" + "是一年的第" + (x1 + day) + "天");
    }
}
