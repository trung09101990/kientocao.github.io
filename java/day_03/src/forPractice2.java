import java.util.Scanner;

public class forPractice2 {
    public static void main(String[] args) {
        System.out.println(repeatString("a"));
        System.out.println(repeatString2("a"));
        System.out.println(repeatString3("a",5));
    }

    public static String repeatString(String a) {
        String text2 = "";
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập chuỗi: ");
//        String text = sc.nextLine();
        for (int i = 1; i <= 10; i++) {
            text2 = text2.concat(a);
        }
        return text2;
    }

    public static String repeatString2(String b) {
        String text3 = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chuỗi: ");
//        String text4 = sc.nextLine();
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                text3 = text3 + b + "-";
            } else {
                text3 = text3 + b;
            }
        }
        return text3;
    }

    public static String repeatString3(String str, int d) {
        String text4 = "";
        for (int i = 1; i <=d; i++) {
            if (i <d) {
                text4 = text4 + str +"-";
            } else {
                text4 = text4.concat(str);
            }
        }
        return text4;
    }
    
}
