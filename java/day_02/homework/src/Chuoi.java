import java.util.Scanner;

public class Chuoi {
    public static void main(String[] args) {
        practice();
    }
    public static void practice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String name = sc.nextLine();
        System.out.println("1.Chuỗi in hoa của chuỗi \"Xin chào các bạn\" là: " + name.toUpperCase());
        System.out.println("2.Chuỗi in thường của chuỗi \"Xin chào các bạn\" là: " + name.toLowerCase());
        System.out.println("3.Số kí tự của chuỗi \"Xin chào các bạn\" là: " + name.length());
        System.out.println("4.Ký tự cuối cùng của chuỗi \"Xin chào các bạn\" là: " + name.charAt(15));
        System.out.println("5.5 kí tự cuối cùng của chuỗi \"Xin chào các bạn\" là: " + name.substring(0,5));
        System.out.println("6.Chuỗi \"Xin chào các bạn\" có chứa chuỗi \"Hello\" hay không: " +  name.equals("Hello"));
    }

}
