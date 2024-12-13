package product;

import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported;
    // Constructor không tham số
    public VietNamImportPrice() {
        super();
        this.taxImported = 0.0f;
    }

    // Constructor có tham số
    public VietNamImportPrice(String proId, String proName, String manufacturer, int producerPrice, float taxImported) {
        super(proId, proName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    // Override lại phương thức calculateSalePrice
    @Override
    public float calculateSalePrice() {
        // Tính giá nhập khẩu (giá nhập khẩu + thuế nhập khẩu)
        float importedPrice = getProducerPrice() + (taxImported * getProducerPrice());

        // Tính giá bán: nhập khẩu + thuế nhập khẩu + 10% của (giá nhập khẩu + thuế nhập khẩu)
        return importedPrice + (0.1f * importedPrice);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Tax Imported: " + taxImported);
        System.out.println("Giá bán: " + calculateSalePrice());
    }

    public static void main(String[] args) {
        VietNamImportPrice product = new VietNamImportPrice();
        // Nhập thông tin từ người dùng
        product.input();
        // Nhập thuế nhập khẩu
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tax imported: ");
        product.setTaxImported(sc.nextFloat());
        product.display();
    }
}
