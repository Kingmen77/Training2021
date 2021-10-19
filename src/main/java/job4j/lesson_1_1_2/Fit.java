package job4j.lesson_1_1_2;

public class Fit {
    public static double manWeight(short height) {
        double rsl = height - 100 * 1.15;
        return rsl;
    }

    public static double womanWeight(short growth) {
        double rsl = growth - 110 * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 174;
        double man = Fit.manWeight(height);
        System.out.println("Man 174 is " + man);
        short growth = 155;
        double woman = Fit.womanWeight(growth);
        System.out.println("Woman 155 is " + woman);
    }
}
