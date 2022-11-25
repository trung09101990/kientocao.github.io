public class MethodDemo {

    public static void main(String[] args) {
        //Coong viec A: Tốn mất 20 dòng code
//        Thực hiện 10 lần: Tốn 200 dòng
//        Có method : Tốn thêm 10 dòng để gọi
        int data = sumTwoNumber(3,4);
        System.out.println(data);
        System.out.println(sumTwoNumber(3,5));
        sayHello();
//        Cách 2 : định nghĩa đối tượng --> Gọi method của đối tượng (thể hiện, instance) đó
//        Class: Khuôn bánh;
//        Instance: Bánh sinh ra từ khuôn
        MethodDemo methodDemo = new MethodDemo();

        methodDemo.sayHelloWithName("Kien");
      }
//      Tính tổng 2 số a , b
//    Tham số: parameter (giá trị ảo, chưa biết trước khi định nghĩa method
//    Đối số: agument (giá trị thật khi gọi method)
      public static int sumTwoNumber(int a, int b)
      {
          int result = a+b;
          return result;
//         Những câu lệnh sau từ khó return không được thực thi
      }
public static void sayHello() {
    System.out.println("Xin chào các bạn");

    }
// Không có static
    public void sayHelloWithName(String name) {
        System.out.println("Xin chao" + name);
    }

}
