import ab.arbolbinariobusqueda;

public class main {
    public static void main(String[] args){
        arbolbinariobusqueda ab = new arbolbinariobusqueda();

        //INSERTAR
        ab.insertar(3);
        ab.insertar(2);
        ab.insertar(4);
        ab.insertar(1);
        ab.insertar(3);
        ab.insertar(5);
        ab.insertar(7);
        ab.insertar(6);

        /*
        mostrar
         */
      ab.mostrarInOrden();
        //INSERTAR
        ab.insertar(8);
        ab.insertar(11);
        ab.insertar(12);

        ab.mostrarInOrden();

    }
}
