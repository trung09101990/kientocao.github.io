public class IfDemo {
    public static void main(String[] args) {
        int hour = 6;
//        &&, ||, !; và hoặc phủ định
        if (hour < 12) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
//            Kết hợp nhiều điều kiện
            boolean troiDep = true;
            boolean coTien = true;
            if (troiDep && coTien) {
                System.out.println("Đi chơi");
            }
            else {
                System.out.println("Đi nhà nghỉ");
            }
            if (troiDep||coTien) {
                System.out.println("Đi chơi lần 2");
            }
//       Toán tử 3 ngôi
        String message = (troiDep&&coTien) ? "Đi ngủ": "Ở nhà";
        System.out.println(message);
        int number = 12;
        String text = number>0? "Số dương": number == 0 ?"Số không": "Số âm";
        System.out.println(text);

    }
    }

