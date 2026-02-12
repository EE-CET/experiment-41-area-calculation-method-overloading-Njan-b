import java.util.Scanner;

class AreaCalculator {

    // Area of Circle
    float calculateArea(float radius) {
        return (float)(Math.PI * radius * radius);
    }

    // Area of Rectangle
    float calculateArea(float length, float breadth) {
        return length * breadth;
    }

    // Area of Triangle
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();

        // Input
        float radius = sc.nextFloat();

        float length = sc.nextFloat();
        float breadth = sc.nextFloat();

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // Calculations
        float circleArea = obj.calculateArea(radius);
        float rectangleArea = obj.calculateArea(length, breadth);
        double triangleArea = obj.calculateArea(base, height);

        // Output (2 decimal places)
        System.out.printf("%.2f\n", circleArea);
        System.out.printf("%.2f\n", rectangleArea);
        System.out.printf("%.2f\n", triangleArea);

        sc.close();
    }
}
