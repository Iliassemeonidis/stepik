package generic;


import java.util.Objects;
import java.util.Optional;

/**
 * Реализуйте generic-класс Pair, похожий на Optional,
 * но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.
 * <p>
 * Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
 * а также статический фабричный метод of().
 *
 * Конструктор должен быть закрытым (private).
 * <p>
 * С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:
 * <p>
 * Pair<Integer, String> pair = Pair.of(1, "hello");
 * Integer i = pair.getFirst(); // 1
 * String s = pair.getSecond(); // "hello"
 * <p>
 * Pair<Integer, String> pair2 = Pair.of(1, "hello");
 * boolean mustBeTrue = pair.equals(pair2); // true!
 * boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
 * <p>
 * <p>
 * Пожалуйста, не меняйте модификатор доступа класса Pair.
 * Для корректной проверки класс должен иметь пакетную видимость
 */

/// решено
public class Pair<T, S> {
    T first;
    S second;

    private Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public S getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public static <T,S> Pair<T,S> of(T value, S st) {
        Pair<T,S> pair = new Pair<T,S>(value,st);
        return pair;
    }

}
