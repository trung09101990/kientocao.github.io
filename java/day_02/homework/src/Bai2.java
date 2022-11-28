import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Introduce();
    }
    public static void Introduce(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String sex = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Xin chào các bạn, mình tên là " + name + ", năm nay mình " + age + " tuổi, giới tính " + sex + ". Hiện tại mình đang sống và làm việc tại " + address);
    }
}
