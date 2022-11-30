import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeatString("a"));
        System.out.println(repeatString2("a"));
        System.out.println(repeatString3("a",5));
        System.out.println(sumNumber());
        System.out.println(tinhTheTich(3));
        printforNumer();
    }
//      Bài 1
    public static String repeatString(String a) {
        String text1 = "";
        for (int i = 1; i <= 10; i++) {
            text1 = text1.concat(a);
        }
        return text1;
    }

//      Bài 2
    public static String repeatString2(String b) {
        String text2 = "";
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                text2 = text2 + b + "-";
            } else {
                text2 = text2 + b;
            }
        }
        return text2;
    }

//      Bài 3
    public static String repeatString3(String str, int d) {
        String text3 = "";
        for (int i = 1; i <=d; i++) {
            if (i <d) {
                text3 = text3 + str +"-";
            } else {
                text3 = text3.concat(str);
            }
        }
        return text3;
    }

//      Bài 4
    public static int sumNumber() {
        int sum =0;
        for (int i=1; i<=100;i++) {
            if (i%5 ==0) {
                sum +=i;
            }
        }
        return sum;
    }

//      Bài 5
    public static double tinhTheTich(double r) {
        double v;
        v = Math.pow(r,3) * Math.PI * 4/3;
        return v;
    }

//      Bài 6
    public static void printforNumer(){
        for (int i = 1; i <= 100 ; i++) {
            if( i % 3 == 0 && i % 5 !=0 ){
                System.out.println("Fizz");
            } else if ( i % 5 == 0 && i % 3 !=0) {
                System.out.println("Buzz");
            } else if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
