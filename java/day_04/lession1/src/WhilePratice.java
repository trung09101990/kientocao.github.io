import java.util.Scanner;

public class WhilePratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option=0;
        boolean isQuit = false;
        while (!isQuit) {
            System.out.println("Nhập số: ");
            option = sc.nextInt();
            if (option==0) {
                System.out.println("Số phải khác 0. Nhập lại ");
            }
            else {
                System.out.println("Số vừa nhập là: " + option);
                isQuit = true;
            }
        }
    }

}
