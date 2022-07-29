/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plancelular;

/**
 *
 * @author jeanpa
 */
public class PlanPostPagoMinutos extends PlanCelular{
    private double minutosNacionales;
    private double costoMinutoNacional;
    private double minutosInternacionales;
    private double costoMinutoInternacioanl;

    public PlanPostPagoMinutos(){
        
    }
    public void establecerMinutosNacionales(double minutosNacionales) {
        this.minutosNacionales = minutosNacionales;
    }

    public void establecerCostoMinutoNacional(double costoMinutoNacional) {
        this.costoMinutoNacional = costoMinutoNacional;
    }

    public void establecerMinutosInternacionales(double minutosInternacionales) {
        this.minutosInternacionales = minutosInternacionales;
    }

    public void establecerCostoMinutoInternacioanl(double costoMinutoInternacioanl) {
        this.costoMinutoInternacioanl = costoMinutoInternacioanl;
    }

    public double obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public double obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public double obtenerCostoMinutoInternacioanl() {
        return costoMinutoInternacioanl;
    }

    @Override
    public void calcularPagomensual() {
        pagomensual=((minutosNacionales*costoMinutoNacional)+
                (minutosInternacionales*costoMinutoInternacioanl));
    }
    public double obtenerPagomensual(){
        return pagomensual;
    }
    public void establecerPagoMensual(double c){
        pagomensual=c;
    }

    @Override
    public String toString() {
        String cadena=String.format("PlanPostPagoMinutos\n");
                cadena=String.format("%s\n"
                        + "%s\n"
                        + "Minutos nacionales:%.2f\n"
                        + "Costo minuto nacioanl:%.2f\n"
                        + "Minutos internacionales:%.2f\n"
                        + "Costo minuto internacional:%.2f\n"
                        + "Total pago mensual:%.2f\n", 
                cadena, 
                super.toString(),
                obtenerMinutosNacionales(),
                obtenerCostoMinutoNacional(),
                obtenerMinutosInternacionales(),
                obtenerCostoMinutoInternacioanl(),
                obtenerPagomensual());
        return cadena;
    }
    
    
}
