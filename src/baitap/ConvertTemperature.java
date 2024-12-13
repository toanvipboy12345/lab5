package baitap;

import java.util.Scanner;

public class ConvertTemperature {
    private float temperNum;

    // từ C sang F
    private float convertC2F() {
        return (float) (temperNum * 1.8 + 32);
    }

    //  F sang C
    private float convertF2C() {
        return (float) ((temperNum - 32) / 1.8);
    }

    // Phương thức chuyển đổi nhiệt độ
    public void convert(float nhietDo, boolean isToC) {
        this.temperNum = nhietDo;
        if (isToC) {
            System.out.println("Nhiệt độ " + nhietDo + "C = " + convertC2F() + "F");
        } else {
            System.out.println("Nhiệt độ " + nhietDo + "F = " + convertF2C() + "C");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập nhiệt độ: ");
        float nhietDo = sc.nextFloat();


        System.out.print("Nhập loại nhiệt độ (C/F): ");
        char type = sc.next().charAt(0);

        ConvertTemperature ct = new ConvertTemperature();

        switch (Character.toUpperCase(type)) {
            case 'C':
                ct.convert(nhietDo, true);
                break;
            case 'F':
                ct.convert(nhietDo, false);
                break;
            default:
                System.out.println("Sai roi");
                break;
        }
        sc.close();
    }
}
