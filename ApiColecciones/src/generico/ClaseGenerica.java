package generico;

public class ClaseGenerica<T> {
    
    private T objeto;
    
    //Contrctor
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("La 'T' es de tipo: " + objeto.getClass().getSimpleName());
    }
    
}