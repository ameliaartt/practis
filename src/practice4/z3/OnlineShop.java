package practice4.z3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShop {

    private static List<User> users = new ArrayList<>();
    private static List<Catalog> catalogs = new ArrayList<>();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        initData();

        Scanner scanner = new Scanner(System.in);

        User currentUser = null;
        while (currentUser == null) {
            System.out.println("1) Войти");
            System.out.println("2) Зарегистрироваться");
            System.out.println("0) Выход");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    currentUser = authenticate(scanner);
                    if (currentUser == null) {
                        System.out.println("Неверный логин или пароль.");
                    }
                    break;
                case 2:
                    register(scanner);
                    break;
                case 0:
                    System.out.println("Пока!");
                    return;
                default:
                    System.out.println("Неверный пункт.");
            }
        }

        System.out.println("Добро пожаловать, " + currentUser.getLogin() + "!");

        while (true) {
            System.out.println("\nМЕНЮ");
            System.out.println("2) Просмотр каталогов");
            System.out.println("3) Просмотр товаров каталога");
            System.out.println("4) Добавить товар в корзину");
            System.out.println("5) Оформить покупку");
            System.out.println("0) Выход");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 2: showCatalogs(); break;
                case 3: showProducts(scanner); break;
                case 4: addToCart(scanner); break;
                case 5: checkout(currentUser); break;
                case 0: return;
                default: System.out.println("Неверный пункт.");
            }
        }
    }

    private static void initData() {
        Catalog electronics = new Catalog(Category.ELECTRONICS);
        electronics.addProduct(new Product("Ноутбук", 79990, Category.ELECTRONICS));
        electronics.addProduct(new Product("Смартфон", 45990, Category.ELECTRONICS));
        electronics.addProduct(new Product("Наушники", 8990, Category.ELECTRONICS));

        Catalog books = new Catalog(Category.BOOKS);
        books.addProduct(new Product("Война и мир", 1500, Category.BOOKS));
        books.addProduct(new Product("Мастер и Маргарита", 1200, Category.BOOKS));

        Catalog clothing = new Catalog(Category.CLOTHING);
        clothing.addProduct(new Product("Футболка", 1500, Category.CLOTHING));
        clothing.addProduct(new Product("Джинсы", 3500, Category.CLOTHING));

        catalogs.add(electronics);
        catalogs.add(books);
        catalogs.add(clothing);
    }

    private static void register(Scanner scanner) {
        System.out.println("\nРЕГИСТРАЦИЯ");

        System.out.print("Придумайте логин: ");
        String login = scanner.nextLine();

        for (User u : users) {
            if (u.getLogin().equals(login)) {
                System.out.println("Такой логин уже занят. Попробуйте другой.");
                return;
            }
        }

        System.out.print("Придумайте пароль: ");
        String password = scanner.nextLine();


        users.add(new User(login, password));
        System.out.println("Регистрация закончена.");
    }

    private static User authenticate(Scanner scanner) {
        System.out.println("ВХОД");
        System.out.print("Логин (user): ");
        String login = scanner.nextLine();
        System.out.print("Пароль (1111): ");
        String password = scanner.nextLine();

        for (User u : users) {
            if (u.authenticate(login, password)) {
                return u;
            }
        }
        return null;
    }

    private static void showCatalogs() {
        System.out.println("\nКАТАЛОГИ");
        for (int i = 0; i < catalogs.size(); i++) {
            System.out.printf("%d) %s%n", (i + 1),
                    catalogs.get(i).getCategory().getTitle());
        }
    }

    private static void showProducts(Scanner scanner) {
        showCatalogs();
        System.out.print("Выберите каталог: ");
        int idx = scanner.nextInt() - 1;
        scanner.nextLine();

        if (idx < 0 || idx >= catalogs.size()) {
            System.out.println("Неверный каталог.");
            return;
        }

        Catalog c = catalogs.get(idx);
        System.out.println("\nТОВАРЫ В КАТАЛОГЕ"
                + c.getCategory().getTitle());

        List<Product> products = c.getProducts();
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d) %s%n", (i + 1), products.get(i));
        }
    }

    private static void addToCart(Scanner scanner) {
        showCatalogs();
        System.out.print("Выберите каталог: ");
        int catIdx = scanner.nextInt() - 1;
        scanner.nextLine();

        if (catIdx < 0 || catIdx >= catalogs.size()) {
            System.out.println("Неверный каталог.");
            return;
        }

        Catalog c = catalogs.get(catIdx);
        List<Product> products = c.getProducts();

        System.out.println("\nТОВАРЫ");
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d) %s%n", (i + 1), products.get(i));
        }

        System.out.print("Выберите товар: ");
        int pIdx = scanner.nextInt() - 1;
        scanner.nextLine();

        if (pIdx < 0 || pIdx >= products.size()) {
            System.out.println("Неверный товар.");
            return;
        }

        cart.addProduct(products.get(pIdx));
    }

    private static void checkout(User user) {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        System.out.println("\nЧЕК");
        System.out.printf("%-25s %10s%n", "Товар", "Цена");
        System.out.println("----------------------------------------");

        for (Product p : cart.getItems()) {
            System.out.printf("%-25s %10.2f%n", p.getName(), p.getPrice());
        }

        System.out.println("----------------------------------------");
        System.out.printf("%-25s %10.2f руб.%n", "ИТОГО:", cart.getTotalPrice());

        System.out.println("\nЗаказ оформлен!");
        System.out.println("Спасибо за покупку, " + user.getLogin() + "!");

        cart.clear();
    }
}