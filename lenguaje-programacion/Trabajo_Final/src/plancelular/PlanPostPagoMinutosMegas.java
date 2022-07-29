/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plancelular;

/**
 *
 * @author jeanpa
 */
public class PlanPostPagoMinutosMegas extends PlanCelular{
    private double minutos;
    private double costoMinutos;
    private double megasGigas;
    private double costoporGiga;
    public PlanPostPagoMinutosMegas(){
        
    }

    public void establecerMinutos(double minutos) {
        this.minutos = minutos;
    }

    public void establecerCostoMinutos(double costoMinutos) {
        this.costoMinutos = costoMinutos;
    }

    public void establecerMegasGigas(double megasGigas) {
        this.megasGigas = megasGigas;
    }

    public void establecerCostoporGiga(double costoporGiga) {
        this.costoporGiga = costoporGiga;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public double obtenerMegasGigas() {
        return megasGigas;
    }

    public double obtenerCostoporGiga() {
        return costoporGiga;
    }
    
    
    
    @Override
    public void calcularPagomensual() {
        pagomensual=((minutos*costoMinutos)+(megasGigas*costoporGiga));
        
    }
    public double obtenerPagoMensual(){
        return pagomensual;
    }
    public void establecerPagoMensual(double c){
        pagomensual=c;
    }

    @Override
   
        public String toString() {
           String cadena=String.format("PlanPostPagoMinutosMegas\n");
                cadena=String.format("%s\n"
                        + "%s\n"
                        + "Minutos:%.2f\n"
                        + "Costo Minutos:%.2f\n"
                        + "MegasGigas:%.2f\n"
                        + "CostoPorgiga:%.2f\n"
                        + "Tota a pagar:%.2f\n",
                        cadena,
                        super.toString(),
                        obtenerMinutos(),
                        obtenerCostoMinutos(),
                        obtenerMegasGigas(),
                        obtenerCostoporGiga(),
                        obtenerPagoMensual());
                return cadena;
    }
    
    
    
    
}
