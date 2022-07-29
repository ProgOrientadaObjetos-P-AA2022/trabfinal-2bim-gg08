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

    
    protected Persona propietario;
    protected String marca;
    protected String modelo;
    protected String numerocelular;
    protected double pagomensual;
    
    public PlanCelular(){
        
    }

    public Persona obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Persona propietario) {
        this.propietario = propietario;
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
                obtenerPropietario().obtenerNombre(),
                obtenerPropietario().obtenerIdentidad(),
                obtenerPropietario().obtenerCiudad(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerNumerocelular());

        return cadena;
    }

}
