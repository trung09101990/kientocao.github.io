public class homeWork {
    public static void main(String[] args) {
        String name;
        name = "Kiên";
        System.out.println("Xin chào các bạn.");
        System.out.println("Xin chào " + name);
        System.out.println("Xin chào \"" + name + "\"");
    }
    public static float sumTwoNumber (float a, float b ) {
        return a+b;
    }
    public static float square(float c) {
        return c*c;
    }
    public static int century(float d) {
        float centuRy = d/100;
        return (int) Math.ceil(centuRy);
    }
    public static float calBmi(float height, float weight) {
        return weight/height;
    }
}
