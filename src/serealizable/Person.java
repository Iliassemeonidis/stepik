package serealizable;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 2294481857370461351L;
    private  int id;
    private  int age;
    private  String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}



