package Lesson6;

public class Cat extends Animal {

    public static final int DEFAULT_MAX_RUN = 200;
    public static final int DEFAULT_MAX_SWIM = 0;

    private static int count;

    public static int getCount() {
        return count;
    }

    public Cat(int maxRun) {
        super (maxRun, DEFAULT_MAX_SWIM);
        count++;
    }

    public Cat() {
        this(DEFAULT_MAX_RUN);
    }

    public boolean swim(int distance) {
        System.out.println("Коты не умеют плавать!");
        return false;
    }

    public boolean run(int distance) {
        if (this.maxRun >= distance) {
            System.out.printf("Кот пробежал дистанцию %d. Max = %d%n", distance, maxRun);
            return true;}

        System.out.printf("Кот не смог пробежать дистанцию %d. Max = %d%n", distance, maxRun);
        return false;
    }

}
