public class Main {
    //phạm vi global: khai báo bên ngoài method
    //Phạm vi mehod: khai báo bên trong method
    //Phạm vi block: Khai báo trong {}
    public String globalVar = "Global variable";
    public static void main(String[] args) {
        System.out.println("Hello kien!");
        System.out.println("Hello kien!");
        System.out.println("cac");
        // Khai báo biến
        String firstName;
        String lastName;
        String first_name; //snake case
        String email ="a123kien@gmail.com";
        // Gán gia trị cho biến
        firstName = "Vu";
        lastName = "Kien";
        int age = 29;
        String address = "Hà Nội";
        String fullName = firstName + " " + lastName;
        System.out.println("firstName = " + lastName);
        System.out.println("lastName = " + lastName);
        System.out.println("fullName = " + fullName);
        System.out.println("Xin chào tôi tên là: " + fullName + " .Năm nay tôi: " + age + " .Tôi ở: " + address);
        //Khai báo các kiểu dữ liệu
        long salary = 1000_000_000L;
        double height = 1.7;
        float weight = 60.5f;
        boolean isExit = true;
        boolean isMarried = false;
        char characterA = 'A';
        char characterB = 'B' ;
        char characterC = 93;
        System.out.println(characterA);
        System.out.println(characterB);
        System.out.println(characterC);
        //ngầm định ép từ nhỏ > lớn, k cần làm gì cả
        // tường minh ép từ lớn > nhỏ, phải chỉ định kiểu dữ liệu muốn ép
        int number = 10;
        long numberOne = number;
        // Ép kiểu tường minh
        short numberTwo = (short) number;
        // phamj vi su dung 1 bien, global , method, block, nếu s dụng ngoài phạm vi sẽ báo lỗi
        //global hoạt động bên ngoài method, method đi liền doi tuong
        //Phạm vi block
        {
            String blockVar = "block variable";
            System.out.println(blockVar);
        }
        //  System.out.println(blockVar); ngoài phạm vi sử dụng nên không sử dụng được

    }
}
//java code --> ByteCode --> Mã máy --> thực thi
//là vùng nhớ lưu trữ giá trị ctr
// biến là chuỗi kí tự và số
// bắt đầu bằng chữ cái, hoặc _
// k dc trùng với từ khóa keyword java
// k dc có khoảng trắng ở giữa
// có độ dài 2 từ thì viết hoa chữ cái đầu
// đặt tên class viết hoa và viết liên
// tên package viết thường hết