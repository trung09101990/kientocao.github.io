import java.util.Scanner;
public class ifPratice {
    public static void main(String[] args) {
        testValue();
        calBmi();
    }
    public static void testValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào giá trị: ");
        int mark = sc.nextInt();
        if(mark>=85) {
            System.out.println("A");
        } else if (mark>=70&&mark<85){
            System.out.println("B");
        } else if (mark>=40&&mark<70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
//        String message = (mark >=85)?"A":(mark>=70&&mark<85)?"B":(mark>=40&&mark<70)?"C":"D";
//        System.out.println(message);
    }
    public static void calBmi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều cao: ");
        double h = sc.nextDouble();
        System.out.print("Nhập vào cân nặng: ");
        double w = sc.nextDouble();
        double bmi = w/(h*h);
       String message = (bmi<18.5)? "Thiếu cân":(bmi>=18.5&&bmi<=24.9)?"Bình thường":"Thừa cân";
        System.out.println(message);
    }
}
