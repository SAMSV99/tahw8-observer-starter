package ir.ac.kntu;

/**
 *
 * @author mhrimaz
 */
public interface Observable {
    /**
     * add an observer to the list of observers of an observable object.
     * @param observer new observer
     */
    public void addObserver(Observer observer);
    public void updateAllObservers();
}

