package job4j.lesson_1_1_2;

public class ArgMethod {
    public static void hello(String name, Integer age) {
        String actualName = name != null ? name : "Mr Smith";
        String ageMessage = age != null ? ", age = " + age : ".";
        System.out.println("Hello, " + actualName + ageMessage);
    }

    public static void hello(String name) {
        ArgMethod.hello(name, null);
    }

    public static void hello(Integer age) {
        ArgMethod.hello(null, age);
    }

    public static void main(String[] args) {
        String name = "Viktor Vasilev";
        int age = 28;
        ArgMethod.hello(name);
        ArgMethod.hello(name, age);
        ArgMethod.hello(age);
        ArgMethod.hello(name, age);
    }
}
