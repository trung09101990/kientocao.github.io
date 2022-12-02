import java.util.Scanner;

public class arrayDemo {
//    kích thước mảng k thay đổi khi chương trình đã chạy
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Số phần tử của mảng là: ");
    int n = sc.nextInt();
    int [] arrayA = new int[n];
    for(int i=0; i<n;i++){
        System.out.println("Phần tử " +i+ " của mảng là: ");
        arrayA[i]= sc.nextInt();
    }
    int sum=0;
    for (int i: arrayA) {
        System.out.print(i +" ");
        sum +=i;
    }
    System.out.println("\nTổng các phần tử của mảng là: " + sum);
}

}
