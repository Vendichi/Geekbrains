package Lesson6;

import java.util.Random;

import static Lesson6.Animal.getCount;

public class TaskLesson6 {

    public static void main(String[] args) {
        Animal[] beast = newBeast();
    play(beast);
    }

    private static Animal[] newBeast() {
        return new Animal[] {
            new Cat(),
            new Dog(),
            new Cat(250),
            new Dog(380, 15),
        };
    }

    private static void play(Animal[] beast) {
        Random random = new Random();

        for (Animal newBeast : beast) {
            System.out.println(newBeast.run(random.nextInt(600)));
            System.out.println(newBeast.swim(random.nextInt(20)));
            System.out.println();
        }

        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}
