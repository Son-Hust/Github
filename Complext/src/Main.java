import java.util.Scanner;

public class Main {

    float a, b, c, d;
    Scanner scanner = new Scanner(System.in);

    public void nhapSoPhuc() {
        System.out.println("Nhap phan thuc so 1:");
        a = scanner.nextFloat();
        System.out.println("Nhap phan ao so 1:");
        b = scanner.nextFloat();
        System.out.println("So phuc thu 1 la: " + a + "+" + b + "j");
        System.out.println("================================================");
        System.out.println("Nhap phan thuc so 2:");
        c = scanner.nextFloat();
        System.out.println("Nhap phan ao so 2:");
        d = scanner.nextFloat();
        System.out.println("So phuc thu 2 la: " + c + "+" + d + "j");
    }

    public void tong() {
        System.out.println("Tong 2 so phuc la:" + (a + c) + "+" + (b + d) + "j");
    }

    public void hieu() {
        System.out.println("Hieu 2 so phuc la:" + (a - c) + "+" + (b - d) + "j");
    }

    public void tich() {
        System.out.println("Tich 2 so phuc la:" + (a * c - b * d) + "+" + (a * c + b * d) + "j");
    }

    public void thuong() {
        System.out.println("Thuong 2 so phuc la:" + (a * c + b * d) / (a * a + b * b) + "+" + (a * d - b * c) / (a * a + b * b) + "j");
    }
    public void agurment(){
        System.out.println("Agurment so thu 1 la:"+"tan"+a/b);
    }


    public static void main(String[] args) {

        Main ex = new Main();
        ex.nhapSoPhuc();
        System.out.println("=========================");
        ex.tong();
        System.out.println("==========================");
        ex.hieu();
        System.out.println("==========================");
        ex.tich();
        System.out.println("==========================");
        ex.thuong();
        System.out.println("==========================");
        ex.agurment();
    }
}
