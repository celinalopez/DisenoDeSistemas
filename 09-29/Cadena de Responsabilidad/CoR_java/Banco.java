package CoR_java;

public class Banco implements IAprobador{
    private IAprobador next;

    public Banco() {
    }

    public Banco(IAprobador next) {
        this.next = next;
    }

    @Override
    public IAprobador getNext() {
        return next;
    }
    // ejecutivo - lider - gerente - director
    @Override
    public void solicitudPrestamo(int monto) {
        EjecutivoCuenta ejecutivo = new EjecutivoCuenta();
        this.setNext(ejecutivo);
        LiderTeamEjecutivo lider = new LiderTeamEjecutivo();
        ejecutivo.setNext(lider);
        Gerente gerente = new Gerente();
        lider.setNext(gerente);
        Director director = new Director();
        gerente.setNext(director);

        next.solicitudPrestamo(monto);
    }

    @Override
    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }
}
