package serealizable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {new Person(1, 15,"Bob"), new Person(2, 12,"Mike"), new Person(3, 18,"Tim")};


        try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            ob.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
