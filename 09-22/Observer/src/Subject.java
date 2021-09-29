public  interface Subject {

public abstract void attach(ILibroMalEstado observer);
public abstract void detach(ILibroMalEstado observer);
public abstract void notifyObserver();

}
