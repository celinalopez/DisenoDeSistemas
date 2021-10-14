/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TVEnsamblado;

/**
 *
 * @author juanj
 */
public class Plasma extends TV {

    private double anguloVision;
    private double tiempoRespuesta;

    public Plasma(double anguloVision, double tiempoRespuesta) {
        this.anguloVision = anguloVision;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public Plasma(double anguloVision, double tiempoRespuesta, String marca, int pulgadas, String color, String descripcion, double precio) {
        super(marca, pulgadas, color, descripcion, precio);
        this.anguloVision = anguloVision;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public Plasma() {
        setDescripcion("Plasma");
        setAnguloVision(60);
        setMarca("Samsung");
        setPrecio(2800);
        setTiempoRespuesta(0.2);
        setPulgadas(40);
    }
    @Override
    public void desc(Color c) {
        System.out.println("El " + getDescripcion() + " fue pintado de color " + c.getDescripcion());
    }
    public double getAnguloVision() {
        return anguloVision;
    }

    public void setAnguloVision(double anguloVision) {
        this.anguloVision = anguloVision;
    }

    public double getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }    
}


