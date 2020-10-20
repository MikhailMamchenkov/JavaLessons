package sixthLesson;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Animal newCat = createCat();
        Animal newDog = createDog();

        System.out.println("new Cat:");

        System.out.println("Can't swim, max run: " + newCat.maxRunLength + " and max jump: " + newCat.maxJumpHeight);

        newCat.run(200);
        newCat.run(250);
        newCat.swim(100);
        newCat.jump(1);
        newCat.jump(3);


        System.out.println();
        System.out.println("new Dog:");
        System.out.println("max swim: " + newDog.maxSwimLength +", max run: " + newDog.maxRunLength + " and max jump: " + newDog.maxJumpHeight);

        newDog.run(450);
        newDog.run(550);
        newDog.swim(9);
        newDog.swim(100);
        newDog.jump(2);
        newDog.jump(4);
    }

    // Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

    static Animal createCat()
    {
        Random random = new Random();

        float maxJump = random.nextInt(10) + random.nextFloat();
        float maxRun = random.nextInt(200) + random.nextFloat();

        Cat cat = new Cat(maxRun, maxJump);

        return cat;
    }

    static Animal createDog()
    {
        Random random = new Random();

        float maxJump = random.nextInt(10) + random.nextFloat();
        float maxRun = random.nextInt(200) + random.nextFloat();
        float maxSwim = random.nextInt(50) + random.nextFloat();


        Dog dog = new Dog(maxRun, maxSwim, maxJump);

        return dog;
    }
}