import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Program();
    }
    public static void  Program() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        Double leng = sc.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        Double wid = sc.nextDouble();
        Double perimeter = (leng+wid)*2;
        Double area = leng*wid;
        System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }
}
