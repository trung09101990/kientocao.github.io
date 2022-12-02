import java.util.Random;
import java.util.Scanner;

public class whilePractice2 {
    public static void main(String[] args) {
//        double number3 = Math.random();
//        int number1 = (int) Math.floor(number3*100);
        Random rd = new Random();
        int number1 = rd.nextInt(101);
//        boolean isQuit = false;
//        while (!isQuit) {
        while (true){
            Scanner sc= new Scanner(System.in);
            System.out.println("Nhập số: ");
            int number2 = sc.nextInt();
           if( number2<number1){
               System.out.println("Bạn nhập số nhỏ hơn rùi, cho nhập lại");
           }
           else if (number2>number1) {
               System.out.println("Bạn nhập số lớn hơn rùi, cho nhập lại");
           } else  {
               System.out.println("Chúc mừng bạn nhập đúng rùi");
//               isQuit=true;
               break;
           }
        }
    }
}