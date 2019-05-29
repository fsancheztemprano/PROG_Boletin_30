package src;

import java.util.ArrayList;

/**
 * @author fsancheztemprano
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Seleccion> integrantes = new ArrayList<>();
        
        integrantes.add(new Futbolista(1,"nom1", "ap",18,5,"del"));
        integrantes.add(new Seleccionador(2,"nom2", "ap",18));
        integrantes.add(new Masajista(3,"nom3", "ap",18,"Titulo", 25));
        integrantes.add(new Entrenador(4,"nom4", "ap",18,2131));

        Seleccion.printSeleccion(integrantes);

    }
}