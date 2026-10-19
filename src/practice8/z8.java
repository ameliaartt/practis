package practice8;

/*8.Задание Палиндром
Дано слово, состоящее только из строчных латинских букв. Проверьте,
является ли это слово палиндромом. Выведите YES или NO.
При решении этой задачи нельзя пользоваться циклами, в решениях на
питоне нельзя использовать срезы с шагом, отличным от 1.  */

import java.util.Scanner;

public class z8 {
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = sc.nextLine().trim();
        System.out.println(isPalindrome(s, 0, s.length() - 1) ? "YES" : "NO");
    }
}