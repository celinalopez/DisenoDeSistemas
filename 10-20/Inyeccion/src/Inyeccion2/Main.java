package Inyeccion2;

public class Main {

    public static void main(String[] args) {
        ServicioEnvio1 servi1 = new ServicioEnvio1();
        ServicioPDF1 servi2 = new ServicioPDF1();
    
        ServicioImpre miServi = new ServicioImpre(servi1, servi2);
        miServi.imprimir();
    }

}
