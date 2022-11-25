public class homeWork {
    public static void main(String[] args) {
        String name;
        name = "Kiên";
        System.out.println("Xin chào các bạn.");
        System.out.println("Xin chào " + name);
        System.out.println("Xin chào \"" + name + "\"");
    }
    public static double sumTwoNumber (double a, double b ) {
        return a+b;
    }
    public static double square(double c) {
        return c*c;
    }
    public static double century(double d) {
        double centuRy = d/100;
        return (int) Math.ceil(centuRy);
    }
    public static double calBmi(double height, double weight) {
        return weight/height;
    }
}
