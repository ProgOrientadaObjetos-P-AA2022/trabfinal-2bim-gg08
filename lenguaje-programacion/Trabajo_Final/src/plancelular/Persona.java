/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plancelular;

/**
 *
 * @author reroes
 */
public class Persona {

    private String nombre;
    private int identidad;
    private String ciudad;

    public Persona() {

    }

    public int obtenerIdentidad() {
        return identidad;
    }

    public void establecerIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre :%s\n"
                + "Identidad:%d\n"
                + "Ciudad:%s\n",
                obtenerNombre(),
                obtenerIdentidad(),
                obtenerCiudad());
        return cadena;

    }

}
