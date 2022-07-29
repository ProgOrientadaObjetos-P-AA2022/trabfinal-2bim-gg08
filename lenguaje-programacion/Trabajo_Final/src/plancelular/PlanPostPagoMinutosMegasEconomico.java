/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plancelular;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular{
    private double minutos;
    private double costoMinutos;
    private double megasGigas;
    private double costoGigas;
    private double porcentajeDescuento;

    public void establecerMinutos(double minutos) {
        this.minutos = minutos;
    }

    public void establecerCostoMinutos(double costoMinutos) {
        this.costoMinutos = costoMinutos;
    }

    public void establecerMegasGigas(double megasGigas) {
        this.megasGigas = megasGigas;
    }

    public void establecerCostoGigas(double costoGigas) {
        this.costoGigas = costoGigas;
    }

    public void establecerPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
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

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    
    
            
    @Override
    public void calcularPagomensual() {
        pagomensual=((minutos*costoMinutos)+(megasGigas*costoGigas));
        pagomensual=pagomensual-(pagomensual*porcentajeDescuento/100);
    }
    public double obtenerPagomensual(){
        return pagomensual;
    }
    public void establecerPagoMensual(double c){
        pagomensual=c;
    }
      public String toString() {
           String cadena=String.format("PlanPostPagoMinutosMegasEconomico\n");
                cadena=String.format("%s\n"
                        + "%s\n"
                        + "Minutos:%.2f\n"
                        + "Costo Minutos:%.2f\n"
                        + "MegasGigas:%.2f\n"
                        + "CostoPorgiga:%.2f\n"
                        + "Porcentaje descuento:%.2f\n"
                        + "Tota a pagar:%.2f\n",
                        cadena,
                        super.toString(),
                        obtenerMinutos(),
                        obtenerCostoMinutos(),
                        obtenerMegasGigas(),
                        obtenerCostoGigas(),
                        obtenerPorcentajeDescuento(),
                        obtenerPagomensual());
                return cadena;
    }
    
}
