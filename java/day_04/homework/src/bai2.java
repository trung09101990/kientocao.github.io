import java.util.Arrays;
import java.util.Scanner;
public class bai2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int option = 0;
            int n = 0;
            int[] array = new int[n];
            int[] newArray = new int[n];
            boolean isQuit = false;
            while (!isQuit) {
                showMenu();
                System.out.print("Nhập lựa chọn : ");
                option = sc.nextInt();
                switch (option) {
                    case 1: {
                        do {
                            System.out.print("Nhập số phần tử của mảng: ");
                            n = sc.nextInt();
                            if (n<=0) {
                                System.out.println("Số phần tử của mảng phải lớn hơn 0");
                            }
                        }
                        while (n<=0);
                        array = new int[n];
                        newArray = new int[n];
                        break;
                    }
                    case 2: {
                        System.out.println("Nhập các phần tử của mảng ");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print("Nhập phần tử [" + i + "] của mảng: ");
                            array[i] = sc.nextInt();
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("Mảng vừa nhập là: " + Arrays.toString(array));
                        break;
                    }
                    case 4: {
                        System.out.println("Thay đổi các phần tử của mảng là số chẵn tăng lên 1 phần tử");
                        for (int i = 0; i < n; i++) {
                            newArray[i] = array[i];
                            if (array[i] % 2 == 0) {
                                newArray[i] = array[i] + 1;
                            }
                        }
                        System.out.println("Mảng mới nhận được là: " + Arrays.toString(newArray));
                        break;
                    }
                    case 5: {
                        isQuit = true;
                        break;
                    }
                    default: {
                        System.out.println("Lựa chọn không hợp lệ");
                        break;
                    }
                }
            }
        }
        public static void showMenu() {
            System.out.println("\n********* MENU *********");
            System.out.println("1 - Nhập số phần tử của mảng ");
            System.out.println("2 - Nhập các phần tử của mảng");
            System.out.println("3 - In mảng ra màn hình");
            System.out.println("4 - Thay đổi các phần tử của mảng là số chẵn tăng lên 1 phần tử");
            System.out.println("5 - Thoát\n");
        }
    }

