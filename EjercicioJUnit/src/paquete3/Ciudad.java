/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {
    
    String nombres;
    int poblacion;

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerNombres(String nombre) {
        this.nombres = nombre;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }

    public void establecerPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n",
                "Cuenca",
                500123
                );
        
        return cadena;  
    }
    
    
    
    
}
