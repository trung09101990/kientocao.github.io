import java.util.Scanner;

public class arrayPractice2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int col = sc.nextInt();
        int [][] arrayA = new int[row][col];
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++){
                System.out.println("Nhập phần tử ["+i+"]["+j +"] của mảng: ");
                arrayA[i][j] = sc.nextInt();
            }
        int max = arrayA[0][0];
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++){
               if(max<arrayA[i][j]){
                   max = arrayA[i][j];
               }
            }
        System.out.println("Phần tử lớn nhất của mảng là:" + max);
    }
}
