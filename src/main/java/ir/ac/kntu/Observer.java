package ir.ac.kntu;

/**
 * 
 * @author [Your name here]
 */
public interface Observer {

    /**
     * This method should invoke when the observed object state has been
     * changed.
     *
     * @param changedObservable pass the changed observable object to the
     * observer
     */
     void update(Observable changedObservable);
}
