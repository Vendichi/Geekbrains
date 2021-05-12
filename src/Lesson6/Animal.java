package Lesson6;

public abstract class Animal {

    private static int count;

    public static int getCount() {
        return count;
    }

    protected int maxRun;
    protected int maxSwim;

    public Animal(int maxRun, int maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;

    }

    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "maxRun=" + maxRun +
                ", maxSwim=" + maxSwim +
                '}';
    }
}
