public class forPratice {
    public static void main(String[] args) {
        int total =0;
//        for(int day = 0; day <=30; day++)
//        {
//            if(day%2 ==0) {
//                System.out.println("Ngày "+ day + " Tiết kiệm 200.000");
//                total += 200000;
//            }
//            else {
//                System.out.println("Ngày " + day + "Tiết kiệm 100.000");
//                total += 100000;
//            }
//        }
//        System.out.printf("Tổng tiền là: %d", total);
//        Vidu: Từ ngày 5 tiết kiệm dc 200000

//        for(int day = 0; day <=30; day++)
//        {
//            if(day>5) {
//                System.out.println("Ngày "+ day + " Tiết kiệm 200.000");
//                total += 200_000;
//            }
//            else {
//                System.out.println("Ngày " + day + "Tiết kiệm 100.000");
//                total += 100_000;
//            }
//        }
//        System.out.printf("Tổng tiền là: %d", total);
     //        Đến ngày số 8, bạn rủ đi nhậu, lấy 500000 trong tiết kiệm ra;

        for(int day = 0; day <=30; day++)
        {
              if(day==8) {
                  total -=500_000;
              }
            if(day>5) {
                System.out.println("Ngày "+ day + " Tiết kiệm 200.000");
                total += 200_000;
            }
            else {
                System.out.println("Ngày " + day + "Tiết kiệm 100.000");
                total += 100_000;
            }
        }
        System.out.printf("Tổng tiền là: %d", total);
    }

}
