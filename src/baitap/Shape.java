package baitap;

/**
 * Lớp Shape dùng để tính diện tích và chu vi của các hình cơ bản.
 */
public class Shape {
    public static final int SHAPE_RECTANGLE = 1;
    public static final int SHAPE_CIRCLE = 2;
    public static final int SHAPE_TRIANGLE = 3;
    public int ShareCode = 0;

    // Tính diện tích hình chữ nhật hoặc vuông
    /**
     * @param width chiều rộng
     * @param height chiều dài
     * @return void
     * Ghi chú: Tính diện tích hình chữ nhật hoặc vuông.
     */
    public void tinhDienTich(float width, float height) {
        float area = width * height;
        System.out.println("Diện tích hình chữ nhật/vuông: " + area);
    }

    // Tính diện tích hình tròn
    /**
     * @param radius bán kính
     * @return void
     * Ghi chú: Tính diện tích hình tròn.
     */
    public void tinhDienTich(float radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Diện tích hình tròn: " + area);
    }

    // Tính diện tích hình tam giác
    /**
     * @param height chiều cao
     * @param bottom đáy
     * @return void
     * Ghi chú: Tính diện tích hình tam giác.
     */
    public void tinhDienTich(float height, double bottom) {
        double area = 0.5 * height * bottom;
        System.out.println("Diện tích hình tam giác: " + area);
    }

    // Tính chu vi hình chữ nhật hoặc vuông
    /**
     * @param width chiều rộng
     * @param height chiều dài
     * @return void
     * Ghi chú: Tính chu vi hình chữ nhật hoặc vuông.
     */
    public void tinhChuVi(float width, float height) {
        float perimeter = 2 * (width + height);
        System.out.println("Chu vi hình chữ nhật/vuông: " + perimeter);
    }

    // Tính chu vi hình tròn
    /**
     * @param radius bán kính
     * @return void
     * Ghi chú: Tính chu vi hình tròn.
     */
    public void tinhChuVi(float radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Chu vi hình tròn: " + perimeter);
    }

    // Tính chu vi hình tam giác
    /**
     * @param edge1 cạnh 1
     * @param edge2 cạnh 2
     * @param edge3 cạnh 3
     * @return void
     * Ghi chú: Tính chu vi hình tam giác.
     */
    public void tinhChuVi(float edge1, float edge2, float edge3) {
        float perimeter = edge1 + edge2 + edge3;
        System.out.println("Chu vi hình tam giác: " + perimeter);
    }

    public static void main(String[] args) {

    }
}
