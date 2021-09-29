public class Main {

  public static void main (String[] args) {

   // Creo el sujeto concreto
    AlarmaLibro sujetoConcreto=new AlarmaLibro();

    Compras  observerCompras= new Compras();

    Administracion observerAdministracion = new Administracion();

    Stock observerStock = new Stock();


    sujetoConcreto.attach(observerCompras);

    sujetoConcreto.attach(observerAdministracion);

    sujetoConcreto.attach(observerStock);

    Libro unLibro= new Libro("Caperucita","MALO");

    Biblioteca biblioteca = new Biblioteca();

    biblioteca.devuelveLibro(unLibro);

  }
}
