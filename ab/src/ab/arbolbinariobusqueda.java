package ab;

public class arbolbinariobusqueda {
    public nodo raiz;

    public arbolbinariobusqueda(){
        raiz = null;
    }
    /*
    arbol vacio
    */
    public Boolean estavacia(){
        return  raiz == null;
    }
    /*
   insertar nodo
    */
    private void  insertar(nodo padre, nodo hijo , int dato){
        if (hijo == null){ //caso base
         nodo nuevo = new nodo(  null ,  dato , null   );
         if(dato >= padre.getDato()){
             padre.setDerecho(nuevo);
         }else{
             padre.setIzquierdo(nuevo);
         }
        } else  {// llamada recursivo

            if(dato >= padre.getDato()){
                insertar(hijo ,hijo.getDerecho(),dato);
            }else{
                insertar(hijo, hijo.getIzquierdo(), dato);
            }
        }
    }
    /*
    metodo axiliar para  insertar dato
    */

    public void  insertar(int dato){
      if (estavacia()){
          nodo nuevo = new nodo(null, dato , null);
          raiz = nuevo;
      }else{
          if (dato >= raiz.getDato()){
              insertar(raiz, raiz.getDerecho(),dato);
          }else{
              insertar(raiz , raiz.getIzquierdo(),dato);
          }

      }
    }
    /*
    metodo recursivo para  mostrar
     */
    private void mostrarInOrden(nodo Nodo){
        if (Nodo == null){//

        }else{//
           mostrarInOrden(Nodo.getIzquierdo());
           System.out.print(Nodo.getDato() + "  ");
           mostrarInOrden(Nodo.getDerecho());
        }
    }
    /*
    metodo axuliar
     */
    public  void  mostrarInOrden(){
        nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}
