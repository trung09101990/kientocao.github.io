import java.util.Arrays;
import java.util.Scanner;

public class arrayPratice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int [] arrayA = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Nhập phần tử "+i+ " của mảng: ");
            arrayA[i] = sc.nextInt();
        }
//        for (int i: arrayA) {
//
//        }
//        Arrays.sort(arrayA);
//        System.out.println(Arrays.toString(arrayA));
//        int temp = arrayA[0];
//        for (int i=0;i<arrayA.length;i++)
//        {
//            if(arrayA[])
//
//        }
        int max=arrayA[0];
        for (int i=0; i< arrayA.length;i++){
            if (arrayA[i]>max){
                max=arrayA[i];
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: "+ max);
        int counteven =0;
        for (int i=0; i< arrayA.length;i++){
            if (arrayA[i]%2==0) {
                counteven += 1;
            }
        }
        System.out.println("Số phần tử chẵn là: " +counteven);
    }
}
