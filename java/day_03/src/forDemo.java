public class forDemo {
    public static void main(String[] args) {
//        begin khởi tạo giá trị vòng lặp
//        condition: Điều kiện để tiếp tục chạy vòng lặp
//        step: Cập nhật giá trị sau mỗi lần lặp
//        Thực hiện cv thức dậy lúc 5:00 trong vòng 30 ngày
//        for (int day = 1; day <= 30; ++day) {
//            if( day%2==0) {
//                System.out.println("Ngày " + day + " thức dậy lúc 5:00");
//            } else {
//                System.out.println("Ngày " +day+ " thức dậy lúc 6:00");
//            }
//        }
//        Ví dụ: thực hiện đến ngày 20 => chán quá không thực hiện nữa;
//        for (int day =1; day<=30; day++)
//        {
//            if(day == 20) {
//                System.out.println("Chán quá, từ bỏ");
//                break;
//            }
//            System.out.println("Ngày "+ day +" Thức dậy lúc 5h");
//        }
//    Ví dụ: continue, vẫn thực hiện cv nhưng cuối tuần nghỉ không thực hiện
        for (int day =1; day<=30; day++){
            if (day%7 ==0){
                System.out.println("Nghỉ xả hơi, ngủ đến chưa");
                continue;
            }
            System.out.println("Ngày" + day + " thức dậy lúc 5h");
        }

    }

}
