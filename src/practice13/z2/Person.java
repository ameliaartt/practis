package practice13.z2;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;

    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFullName() {
        boolean hasFirst = firstName != null && !firstName.isEmpty();
        boolean hasMiddle = middleName != null && !middleName.isEmpty();

        int cap = (lastName != null ? lastName.length() : 0) + 1
                + (hasFirst ? 2 : 0) + (hasMiddle ? 2 : 0);
        StringBuilder sb = new StringBuilder(cap);

        if (lastName != null) sb.append(lastName);

        if (hasFirst) {
            sb.append(' ').append(firstName.charAt(0)).append('.');
        }
        if (hasMiddle) {
            if (!hasFirst) sb.append(' ');
            sb.append(middleName.charAt(0)).append('.');
        }
        return sb.toString().trim();
    }
}
