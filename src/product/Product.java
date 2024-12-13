package product;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Product {
    private String proId;
    private String proName;
    private String manufacturer;
    private int producerPrice;
    //Constructor
    public Product(String proId, String proName, String manufacturer, int producerPrice) {
        this.proId = proId;
        this.proName = proName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;

    }
    public Product() {}
    public String getProId() {
        return proId;
    }
    public String getProName() {
        return proName;

    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getProducerPrice() {
        return producerPrice;
    }
    public void setProId(String proId) {
        this.proId = proId;
    }
    public void setProName(String proName) {
        this.proName = proName;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setProducerPrice(int producerPrice) {
        this.producerPrice = producerPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", producerPrice=" + producerPrice +
                ", salePrice=" + calculateSalePrice() +
                '}';
    }

    //Method
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product ID: ");
        proId = sc.nextLine();
        System.out.println("Enter product name: ");
        proName = sc.nextLine();
        System.out.println("Enter product manufacturer: ");
        manufacturer = sc.nextLine();
        System.out.println("Enter product producer price: ");
        producerPrice = sc.nextInt();
    }
    public void display(){
        System.out.println("Product ID: " + proId);
        System.out.println("Product Name: " + proName);
        System.out.println("Product Manufacturer: " + manufacturer);
        System.out.println("Product Price: " + producerPrice);
        System.out.println("Sale price:" +calculateSalePrice());
    }
    public float calculateSalePrice(){
        return producerPrice + (float) (5 * producerPrice) /100;
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.input();
        product.calculateSalePrice();
        product.display();
    }
}
