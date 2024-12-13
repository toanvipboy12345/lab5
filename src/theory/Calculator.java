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
    public void PassByValue(int a) {
        a = a +10;
        System.out.println(a);

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
    }
}
