package practice3.z21;

public class Main4 {
    public static void main(String[] args) {
        Double d_pi = Double.valueOf(3.14);
        Double d_e = Double.valueOf("2.71828");

        String str = "6356.8";
        double r_earth = Double.parseDouble(str);
        System.out.println("Число Пи: " + d_pi + " Число Эйлера: " + d_e +
                " Радиус сестры в км (из String сделали double): " + r_earth);

        byte b = d_pi.byteValue();
        double d = d_pi.doubleValue();
        float fl = d_pi.floatValue();
        int i = d_pi.intValue();
        long l = d_pi.longValue();
        short sh = d_pi.shortValue();

        System.out.println("byte = " + b);
        System.out.println("double = " + d);
        System.out.println("float = " + fl);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("short = " + sh);

        String dStr = Double.toString(3.14);
        System.out.println("Литерал 3.14 → строка: \"" + dStr + "\"");
        System.out.println("Длина строки: " + dStr.length() + " символов");


    }
}
