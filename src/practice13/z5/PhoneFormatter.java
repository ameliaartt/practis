package practice13.z5;

public class PhoneFormatter {

    public static String format(String phone) {
        if (phone == null) throw new IllegalArgumentException("phone is null");
        phone = phone.trim();

        String countryCode;
        String local;

        if (phone.startsWith("+")) {
            String digits = phone.substring(1);
            if (digits.length() < 11) {
                throw new IllegalArgumentException("Слишком короткий номер: " + phone);
            }
            int ccLen = digits.length() - 10;
            countryCode = "+" + digits.substring(0, ccLen);
            local = digits.substring(ccLen);
        } else if (phone.startsWith("8")) {
            String digits = phone.substring(1);
            if (digits.length() != 10) {
                throw new IllegalArgumentException("Номер РФ должен содержать 10 цифр после 8");
            }
            countryCode = "+7";
            local = digits;
        } else {
            throw new IllegalArgumentException("Неизвестный формат: " + phone);
        }

        String part1 = local.substring(0, 3);
        String part2 = local.substring(3, 6);
        String part3 = local.substring(6, 10);

        return countryCode + part1 + part2 + part3;
    }

    public static void main(String[] args) {
        System.out.println(format("+79175655655"));
        System.out.println(format("89175655655"));
        System.out.println(format("+104289652211"));
    }
}
