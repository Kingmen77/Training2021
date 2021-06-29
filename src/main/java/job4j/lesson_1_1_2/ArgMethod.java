package job4j.lesson_1_1_2;

public class ArgMethod {
    public static void hello(int age, String name) {
        System.out.println("Hello, " + name + ", age = " + age);
    }
    public static void hello(String name, int age) {

    }
    public static void hello(String name) {

    }
    public static void hello(int age) {

    }

    public static void main(String[] args) {
        String name = "Viktor Vasilev";
        int age = 28;
        ArgMethod.hello(name);
        ArgMethod.hello(name, age);
        ArgMethod.hello(age);
        ArgMethod.hello(age, name);

    }


}
