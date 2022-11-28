public class homeWork {
    public static void main(String[] args) {

    }
    public static void getName1(String name){
        System.out.println("Xin chào các bạn.");
    }
    public static void getName2(String name){
        System.out.println("Xin chào " + name);
    }
    public static void getName3(String name){
        System.out.println("Xin chào \"" + name + "\"");
    }
    public static double sumTwoNumber (double a, double b ) {
        return a+b;
    }
    public static double square(double c) {
        return c*c;
    }
    public static int century(double d) {
        double centuRy = d/100;
        return (int) Math.ceil(centuRy);
    }
    public static double calBmi(double height, double weight) {
        return weight/(height*height);
    }
}
