/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plancelular;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double megasGigas;
    private double costoporGiga;
    private double tarifaBase;

    public void establecerMegasGigas(double megasGigas) {
        this.megasGigas = megasGigas;
    }

    public void establecerCostoporGiga(double costoporGiga) {
        this.costoporGiga = costoporGiga;
    }

    public void establecerTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double obtenerMegasGigas() {
        return megasGigas;
    }

    public double obtenerCostoporGiga() {
        return costoporGiga;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public void calcularPagomensual() {
        pagomensual = (megasGigas * costoporGiga) + tarifaBase;//preguntar

    }

    public double obtenerPagomensual() {
        return pagomensual;
    }
    public void establecerPagoMensual(double c){
        this.pagomensual=c;
    }
    @Override
    public String toString() {
           String cadena=String.format("PlanPostPagoMegas\n");
                cadena=String.format("%s\n"
                        + "%s\n"
                        + "MegasGigas:%.2f\n"
                        + "Costo por Giga:%.2f\n"
                        + "Tarifa base:%.2f\n"
                        + "Total Pagar plan:%.2f\n",
                        cadena,
                        super.toString(),
                        obtenerMegasGigas(),
                        obtenerCostoporGiga(),
                        obtenerTarifaBase(),
                        obtenerPagomensual());
                return cadena;
    }
    
    
}
