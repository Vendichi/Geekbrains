package Lesson6;

public class Dog extends Animal {

    public static final int DEFAULT_MAX_RUN = 500;
    public static final int DEFAULT_MAX_SWIM = 10;

    private static int count;

    public static int getCount() {
        return count;
    }

    public Dog(int maxRun, int maxSwim) {
        super (maxRun, maxSwim);
        count++;
    }

    public Dog() {
        this(DEFAULT_MAX_RUN, DEFAULT_MAX_SWIM);
    }

    public boolean swim(int distance) {
        if (this.maxSwim >= distance) {
            System.out.printf("Собака пробежала дистанцию %d. Max = %d%n", distance, maxRun);
            return true;}

        System.out.printf("Собака не смогла пробежать дистанцию %d. Max = %d%n", distance, maxRun);
        return false;
    }

    public boolean run(int distance) {
        if (this.maxRun >= distance) {
            System.out.printf("Собака пробежала дистанцию %d. Max = %d%n", distance, maxRun);
            return true;}

        System.out.printf("Собака не смогла пробежать дистанцию %d. Max = %d%n", distance, maxRun);
        return false;
    }
}
