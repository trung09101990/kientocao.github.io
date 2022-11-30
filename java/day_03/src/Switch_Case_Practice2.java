import java.util.Scanner;

public class Switch_Case_Practice2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng : ");
        int month = sc.nextInt();
        if (month > 12) {
            System.out.println("tháng lỗi");
        } else {
            switch (month) {
                case 1:
                case 2:
                case 3: {
                    System.out.println("Mùa xuân");
                    break;
                }

                case 4:
                case 5:
                case 6: {
                    System.out.println("Mùa hạ");
                    break;
                }
                case 7:
                case 8:
                case 9: {
                    System.out.println("Mùa thu");
                    break;
                }
                case 10:
                case 11:
                case 12: {
                    System.out.println("Mùa đông");
                    break;
                }

            }
        }
    }
}
