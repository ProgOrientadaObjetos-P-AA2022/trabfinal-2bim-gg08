/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plancelular;

/**
 *
 * @author jeanpa
 */
public abstract class PlanCelular {

    
    protected String nombrePropietario;
    protected String cedula;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected String numerocelular;
    protected double pagomensual;
    
    public PlanCelular(){
        
    }

    public void establecerNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }

    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public void establecerModelo(String modelo) {
        this.modelo = modelo;
    }

    public void establecerNumerocelular(String numerocelular) {
        this.numerocelular = numerocelular;
    }

    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public String obtenerNumerocelular() {
        return numerocelular;
    }

   

    public abstract void calcularPagomensual();

    @Override
    public String toString() {
        String cadena = String.format("Nombre:%s\n"
                + "Cedula:%s\n"
                + "Ciudad:%s\n"
                + "Marca:%s\n"
                + "Modelo:%s\n"
                + "Numero de celular:%s\n",
                obtenerNombrePropietario(),
                obtenerCedula(),
                obtenerCiudad(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerNumerocelular());

        return cadena;
    }


}
