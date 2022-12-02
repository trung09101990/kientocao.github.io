import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String name = new String(sc.nextLine());
        System.out.println("Họ và tên sau khi chuẩn hóa là: ");
        System.out.print(String.valueOf(name.charAt(0)).toUpperCase());
        for(int i=1;i<name.length();i++){
            if( (name.charAt(i)!=' ')&&name.charAt(i-1)==' ' )
                System.out.print(String.valueOf(name.charAt(i)).toUpperCase());
            else
                System.out.print(name.charAt(i));
        }
    }
}
