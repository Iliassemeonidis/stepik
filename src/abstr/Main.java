package abstr;

/**
 * Напишите класс AsciiCharSequence,реализующий компактное хранение
 * последовательности ASCII-символов (их коды влезают в один байт)
 * в массиве байт. По сравнению с классом String, хранящим каждый
 * символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.
 *
 * Класс AsciiCharSequence должен:
 *
 * определять методы length(), charAt(), subSequence() и toString()
 * Сигнатуры методов и ожидания по их поведению смотрите в описании
 * интерфейса java.lang.CharSequence (JavaDoc или исходники).
 *
 * В данном задании методам charAt() и
 * subSequence() всегда будут подаваться корректные входные параметры,
 * поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.
 */

/// решена задача
public class Main {
    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};

        AsciiCharSequence answer = new AsciiCharSequence(example);

        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello

//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }


}
