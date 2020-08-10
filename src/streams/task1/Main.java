package streams.task1;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Реализуйте метод, который зачитает данные из InputStream
 * и преобразует их в строку, используя заданную кодировку.
 *
 * Пример
 *
 * InputStream последовательно возвращает четыре байта: 48 49 50 51.
 *
 * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
 */


//// решена
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        try {
            System.out.println(readAsString(inputStream, StandardCharsets.US_ASCII));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        int i =  inputStreamReader.read();
        while (i != -1) {
            stringBuilder.append((char)i);
            i =  inputStreamReader.read();
        }

        return stringBuilder.toString();
        // your implementation here
    }
}
