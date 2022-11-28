public class StringDemo {
    public static void main(String[] args) {
        //Khai báo kiểu literal tạo ra một giá trị trong string pool nằm trong heap pro để tham chiếu đến các biến
        String name = "Kiên";
        String name1 ="Kiên";
        //Khai báo kiểu Object (new) tạo ra các ô nhớ khác nhau để tham chiếu đến các biến
        String email = new String("a123kien@gmail.com");
        String email1 = new String("a124kien@gmail.com");
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        StringDemo demo = new StringDemo();
        String text1 = "Xin chào các bạn";
        String text2 = "Xin chào các bạn";
        //So sánh chuỗi; so sánh địa chỉ ô nhớ (thường được áp dụng với primative type byte short int long
        System.out.println(name == name1); //true
        System.out.println(email == email1); // false
        System.out.println(name.equals(name1));//true
        System.out.println(email.equals(email1));//false
        String text = "Xin chào các bạn";
        System.out.println("In thường: "+ text.toLowerCase());
        System.out.println("In hoa:" + text.toUpperCase());
        System.out.println("Độ dài: " + text.length());
        System.out.println("Cắt chuỗi: " + text.substring(0,8));
        System.out.println("Vị trí thứ 10 là kí tự: " + text.charAt(9));
        System.out.println("So sánh:" + text.equals("Xin chào các bạn"));
        System.out.println("So sánh không phân biệt hoa thường: " + text.equalsIgnoreCase(text1));
        System.out.println("Bắt đầu bằng chuỗi name không: " + text.startsWith(name));;
    }
}
