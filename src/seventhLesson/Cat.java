package seventhLesson;

public class Cat {

    private String name;
    private int appetite;
    private boolean isFull;



    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }


    public void eat(Plate plate) {

        if(plate.hasEnoughFood(appetite) && !isFull) {
            plate.decreaseFood(appetite);
            isFull = true;
            System.out.println(name +" покушал!");
        }
        else if (isFull) {
            System.out.println(name + " Не хочет кушать");
        }
        else {
            System.out.println("Для " + name + " мало еды в тарелке!");
        }

    }

}


