import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("姓名: ");
        String name = scanner.next();

        System.out.print("年齡: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.print("學號: ");
        String SN = scanner.nextLine();

        System.out.print("成績: ");
        double Grade = scanner.nextDouble();

        System.out.println("姓名: " + name);
        System.out.println("年齡: " + age +"歲");
        System.out.println("學號: " + SN);
        System.out.println("平均成績: " + Grade);
        scanner.close();
    }
}
