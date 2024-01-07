// 測試
public class Main {
    public static void main(String[] args) {
        // 使用 Circle
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        // 使用 Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }

    // 將數值四捨五入到小數點後兩位
    private static double roundToTwoDecimalPlaces(double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(value));
    }
}