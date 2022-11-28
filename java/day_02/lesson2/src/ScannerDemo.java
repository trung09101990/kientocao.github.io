import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
//        Khởi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);
//        Nhập tên
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
//        nextLine chuỗi
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        System.out.println("Nhập tuổi:");
//        Cách 1: Khắc phục lỗi trôi lệnh
//        int age = Integer.parseInt(sc.nextLine()); 26=> "26"
//        Cách 2:
        int age = sc.nextInt();
        sc.nextLine();
//        String age = sc.nextLine();
        System.out.println("Nhập email:");
        String email = sc.nextLine();
//        Println tự động xuống dòng;
        System.out.println("Tên tôi là: " + name +"." + " Địa chỉ là: "
                + address + ". Năm nay tôi" + age + " tuổi"
                + ". Email của tôi là: " + email);
        System.out.println("Tên:" + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Email: " + email);
        System.out.println("Địa chỉ: " + address);
        System.out.println();
//        Print không tự động xuống dòng
        System.out.print("Tên:" + name + "\n\t");
        System.out.print("Tuổi: " + age+ "\n") ;
        System.out.print("Email: " + email + "\n")  ;
        System.out.print("Địa chỉ: " + address + "\n");
//        Printf: In theo định dạng, giữ chỗ
        System.out.printf("Tên : %s\n", name);
        System.out.printf("Tuổi : %s\n", name);
        System.out.printf("Email : %s\n", name);
        System.out.printf("Địa chỉ : %s\n", name);
        System.out.println();
        System.out.printf("%-20s %-18s %-18d\n", "tên", "email",29);
        System.out.printf("%-20s %-18s %-18d\n", "Vu manhj kien", "a12kien",29);
        System.out.printf("%-20s %-18s %-18d\n", "Vu manhj kien", "a12kien",29);
        System.out.printf("%-20s %-18s %-18d\n", "Vu manhj kien", "a12kien",29);

    }
}
