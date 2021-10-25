package test;

import generico.ClaseGenerica;

public class Test {

    public static void main(String[] args) {
        ClaseGenerica<Integer> obtInt = new ClaseGenerica(15);
        obtInt.obtenerTipo();
        
        ClaseGenerica<String> obtString = new ClaseGenerica("Ignacio");
        obtString.obtenerTipo();
    }
    
}