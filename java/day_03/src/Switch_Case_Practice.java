import java.util.Scanner;

public class Switch_Case_Practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        int day = sc.nextInt();
        if (day>6) {
            System.out.println("Nhập lại: ");

        }
        else {
            switch (day) {
                case 0: {
                    System.out.println("Hôm nay là chủ nhật");
                    break;
                }
                case 1: {
                    System.out.println("Hôm nay là thứ hai");
                    break;
                }
                case 2: {
                    System.out.println("Hôm nay là thứ ba");
                    break;
                }
                case 3: {
                    System.out.println("Hôm nay là thứ tư");
                    break;
                }
                case 4: {
                    System.out.println("Hôm nay là thứ năm");
//                break;
                }
                case 5: {
                    System.out.println("Hôm nay là thứ sáu");
                    break;
                }
                case 6: {
                    System.out.println("Hôm nay là thứ bảy");
                    break;
                }

            }

        }
    }
}
