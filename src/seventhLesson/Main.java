package seventhLesson;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Barsik", 23);
        cats[1] = new Cat("kesha", 10);
        cats[2] = new Cat("kyza", 55);
        cats[3] = new Cat("gogo", 15);

        Plate plate = new Plate(100);

        for(int i = 0; i < cats.length; i++) {

            cats[i].eat(plate);
        }

        int food = 50;
        System.out.println("Добавление еды в тарелку в размере: " + food);
        plate.increaseFood(food);

        for(int cat = 0; cat < cats.length; cat++) {
            cats[cat].eat(plate);
        }

    }


}
