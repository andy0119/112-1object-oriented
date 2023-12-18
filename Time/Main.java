public class Main {
    public static void main(String[] args) {
        // 創建 MyTime 實例
        MyTime time1 = new MyTime(10, 30);
        MyTime time2 = new MyTime(8);
        MyTime time3 = new MyTime();

        // 印出時間
        System.out.println("Time 1: " + time1.hours + ":" + time1.minutes);
        System.out.println("Time 2: " + time2.hours + ":" + time2.minutes);
        System.out.println("Time 3: " + time3.hours + ":" + time3.minutes);

        // 創建 Calculator 實例
        Calculator calculator = new Calculator();

        // 使用不同版本的 add 方法
        int sum1 = calculator.add(5, 7);
        float sum2 = calculator.add(3.5f, 2.8f);
        int sum3 = calculator.add(2, 4, 6);

        // 印出結果
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}