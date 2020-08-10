package taskIsPowerOfTwo;
/**
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 *
 * Решать можно разными способами:
 *
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 *
 * применив пару трюков из двоичной арифметики;
 *
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 *
 * Sample Input 1:
 *
 * 0
 * Sample Output 1:
 *
 * false
 * Sample Input 2:
 *
 * 1
 * Sample Output 2:
 *
 * true
 * Sample Input 3:
 *
 * -2
 * Sample Output 3:
 *
 * true
 *
 */
//// задача решена
public class Main {
    public static boolean isPowerOfTwo(int value) {

        int x = 2;
        if (value < 0) {
            value *= -1;
        }
        int result = Integer.bitCount(x) ^ Integer.bitCount(value);
        return result == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
}
