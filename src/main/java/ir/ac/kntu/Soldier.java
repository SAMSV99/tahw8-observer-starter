package ir.ac.kntu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author [Your Name here]
 */
public class Soldier implements Observable {

    private int health;
    //TODO: save a list of observers

    public Soldier() {
        //TODO: initialize your list of observers
        health = 100;
    }

    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
            updateAllObservers();
        }
    }

    public int getHealth() {
        return health;
    }

}


