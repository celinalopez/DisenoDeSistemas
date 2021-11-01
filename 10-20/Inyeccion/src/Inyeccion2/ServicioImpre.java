package Inyeccion2;

public class ServicioImpre {
    ServicioEnvio1 servicioA;
    ServicioPDF1 servicioB;

    public ServicioPDF1 getServicioB() {
        return servicioB;
    }

    public void setServicioB(ServicioPDF1 servicioB) {
        this.servicioB = servicioB;
    }

    public ServicioEnvio1 getServicioA() {
        return servicioA;
    }

    public void setServicioA(ServicioEnvio1 servicioA) {
        this.servicioA = servicioA;
    }


    public ServicioImpre(ServicioEnvio1 servicioA,ServicioPDF1 servicioB) {

        this.servicioA= servicioA;
        this.servicioB= servicioB;
    }
    public void imprimir() {

        servicioA.enviar();
        servicioB.pdf();
    }
}
