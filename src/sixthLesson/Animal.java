package sixthLesson;

import java.util.Random;

public class Animal {

    protected float maxRunLength;
    protected float maxSwimLength;
    protected float maxJumpHeight;

    Animal(float maxRunLength, float maxSwimLength, float maxJumpHeight) {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    void run(float length) {
        System.out.println("run " + isAvailableAction(maxRunLength, maxJumpHeight));
    }

    void swim(float length) {
        System.out.println("swim " + isAvailableAction(maxRunLength, maxJumpHeight));
    }

    void jump(float height) {
        System.out.println("jump " + isAvailableAction(maxRunLength, maxJumpHeight));
    }

    boolean isAvailableAction(float required, float expected) {
        return required <= expected;
    }


}
