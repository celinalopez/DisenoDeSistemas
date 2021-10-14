package CoR_java;

// Hacer clase abstracta y hacer la recursion

public interface IAprobador {

    public IAprobador getNext();
    public void solicitudPrestamo(int monto);
    public void setNext(IAprobador aprobador);
}
