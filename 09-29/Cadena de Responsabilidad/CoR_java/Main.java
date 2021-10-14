package CoR_java;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.solicitudPrestamo(9000);
        banco.solicitudPrestamo(50000);
        banco.solicitudPrestamo(100000);
        banco.solicitudPrestamo(150000);
    }
}
