package CoR_java;

public class LiderTeamEjecutivo implements IAprobador{
    private  IAprobador next;

    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        if (monto > 10000 && monto <= 50000){
            System.out.println("Lo manejo yo, le lider");
        } else {
            next.solicitudPrestamo(monto);
        }
    }

    @Override
    public void setNext(IAprobador aprobador) {
        next = aprobador;
    }
}
