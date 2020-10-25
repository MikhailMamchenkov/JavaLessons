package seventhLesson;

public class Plate {

    private int food;


    public Plate(int food) {
        this.food = food;
    }


    public void decreaseFood(int appetite) {
            food -= appetite;
    }

    public void increaseFood(int food) {
        this.food += food;
    }

    boolean hasEnoughFood(int appetite) {
        return appetite <= food;
    }



    public boolean info() {

        if (food == 0) {
            System.out.println("Еда закончилась, ждите хозяина");
        }
        else if(food < 0) {

        }
        return false;
    }

}

