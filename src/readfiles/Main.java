package readfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] strings = null;
        int[] numbers = new int[3];

        try(Scanner scanner = new Scanner(new File("home"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings = line.split("#");

                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = Integer.parseInt(strings[i]);
                }
            }

            System.out.println(Arrays.toString(numbers));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
