package theory;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public void multiply(int a, int b) {
        int res = a * b;
        System.out.println("Kết quả phép nhân: " + res);
    }

    public void divide(int a, int b) {
        if (b != 0) {
            double res = (double) a / b;
            System.out.println("Kết quả phép chia: " + res);
        } else {
            System.out.println("Lỗi: Không thể chia cho 0.");
        }
    }

    public void passByValue(int a) {
        a = a + 10;
        System.out.println(a);
    }

    // New method to calculate area of a circle
    public float calculateCircleArea(float radius) {
        Circle circle = new Circle();
        return circle.getPI() * radius * radius;
    }

    // Phương thức sửa lỗi addnum
    public void addnum(int... num) {
        int total = 0;
        for (int n : num) {
            total += n;
        }
        System.out.println("Tổng các số: " + total); // Hiển thị kết quả tổng
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test add
        int sum = calc.add(10, 5);
        System.out.println("Kết quả phép cộng: " + sum);

        // Test subtract
        int difference = calc.subtract(10, 5);
        System.out.println("Kết quả phép trừ: " + difference);

        // Test multiply
        calc.multiply(10, 5);

        // Test divide
        calc.divide(10, 5);
        calc.divide(10, 0); // Kiểm tra chia cho 0

        // Test calculateCircleArea
        float radius = 5.0f;
        float area = calc.calculateCircleArea(radius);
        System.out.println("Diện tích hình tròn với bán kính " + radius + " là: " + area);

        // Test addnum
        calc.addnum(10, 5, 15); // Thêm nhiều số và hiển thị kết quả
    }
}

class Circle {
    public float getPI() {
        return 3.14f;
    }
}
