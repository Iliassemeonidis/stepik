package javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("write number 1");
//        int number1 = Integer.parseInt(reader.readLine());
//        System.out.println("write number 2");
//        int number2 = Integer.parseInt(reader.readLine());
        int max = 140;
        int min = 96;
        /**
         * 1) 140 : 96 = 1 (остаток 44)
         *
         * 2) 96 : 44 = 2 (остаток 8)
         *
         * 3) 44 : 8 = 5 (остаток 4)
         *
         * 4) 8 : 4 = 2
         */

        int count = 1;

        while (count != 0) {

            min = max%min;
            count = min % count;
        }
        System.out.println(count);

    }
}
