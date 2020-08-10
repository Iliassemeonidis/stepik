package anonimclass;


interface Animal {
    void eat();
}
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("eatig");
            }
        };
        a.eat();
    }
}
