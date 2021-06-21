package job4j.lesson_1_1_2;

public class Calculator {
    public static void plus(int first, int second) {    // Метод и (аргументы)
       int result = first + second;             // Итог который должен получится
       System.out.println(result);
    }

    public static void main(String[] args){
        Calculator.plus(100, 500);   //назначение переменных first и second
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}
