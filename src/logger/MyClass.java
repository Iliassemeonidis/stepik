package logger;


/*
Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
Метод getCallerClassAndMethodName() должен возвращать имя класса и метода,
откуда вызван метод, вызвавший данный утилитный метод.
Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
является точкой входа в программу, т.е. его никто не вызывал.
 */
// решил
public class MyClass {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());    }



    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            if (stackTraceElements.length >= 3) {

                return   stackTraceElements[1].getClassName() + "#" + stackTraceElements[2].getMethodName();
            }
            return null;


    }
}

