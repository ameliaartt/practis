package practice18;

public class ThrowsDemo {
    /*
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("data for " + key);
    }
    public static void main(String[] args) {
        new ThrowsDemo().getDetails(null);
    }
    программа аварийно завершается
    */
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("data for " + key);
        } catch (NullPointerException e) {
            System.out.println("Обработано: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        new ThrowsDemo().getDetails(null);
    }
}
