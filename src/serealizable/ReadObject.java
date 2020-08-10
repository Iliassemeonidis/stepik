package serealizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try (ObjectInputStream ob = new ObjectInputStream(new FileInputStream("people.bin"))) {
            Person person[] = (Person[]) ob.readObject();
            System.out.println(Arrays.toString(person));
        } catch (IOException | ClassNotFoundException io) {
            io.printStackTrace();
        }


    }
}
