package practice19.z1;

public class INNValidator {
    public static void validate(Client client) throws InvalidINNException {
        String inn = client.getInn();
        if (inn == null || !inn.matches("\\d{12}")) {
            throw new InvalidINNException(
                    "Недействительный ИНН (должно быть 12 цифр): " + inn);
        }
        int region = Integer.parseInt(inn.substring(0, 2));
        if (region < 1 || region > 99) {
            throw new InvalidINNException(
                    "Недействительный код региона в ИНН: " + inn);
        }
    }
}
