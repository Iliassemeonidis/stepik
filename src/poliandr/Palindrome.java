package poliandr;

/**
 * Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
 */
//// задача решена
public class Palindrome {
    public static boolean isPalindrome(String text) {
        String str = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder reverse = stringBuilder.append(str).reverse();

        return str.contentEquals(reverse);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}
