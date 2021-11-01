package EjemploGranito;

import java.util.ArrayList;

public class Composite implements ISueldo{
    private ArrayList<ISueldo> empleados= new ArrayList<ISueldo>();
    @Override
    public double getSueldo() {

        double sumador = 0;
        for (int i = 0; i < empleados.size(); i++) {
            sumador = sumador + empleados.get(i).getSueldo();
        }
            return sumador;
        }

      public void agrega(ISueldo p){
            empleados.add(p);
        }

    }

