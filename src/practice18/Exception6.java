package practice18;

public class Exception6 {
    /*
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    при корректном ключе выводится data for correctKey.
    При null исключение, выброшенное в getDetails, не обрабатывается там, а пробрасывается в printMessage,
    затем в main — и программа падает с трассировкой стека, в которой видно всю цепочку вызовов
    (getDetails → printMessage → main).
     */
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Перехвачено в printMessage: " + e.getMessage());
        }
    }
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        Exception6 demo = new Exception6();
        demo.printMessage("correctKey");
        demo.printMessage(null);
    }
    /*программа не ломается, при null выводится сообщение об ошибке.
    Обработка находится на том уровне, где есть контекст — printMessage знает, что делать с отсутствующим ключом.*/
}
