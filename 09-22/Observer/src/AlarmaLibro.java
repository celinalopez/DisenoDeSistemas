import java.util.ArrayList;

public class AlarmaLibro implements Subject{
    private static ArrayList<ILibroMalEstado> observadores =  new ArrayList();

    @Override
    public void attach(ILibroMalEstado unObserver) {
    observadores.add(unObserver);
    }

    @Override
    public void detach(ILibroMalEstado unObserver) {
    observadores.remove(unObserver);
    }

    @Override
    public void notifyObserver() {
        for (ILibroMalEstado i : observadores)
        {

            i.update();
        }
    }
}
