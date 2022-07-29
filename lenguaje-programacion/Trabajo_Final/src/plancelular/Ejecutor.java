/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plancelular;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jeanpa
 */
public class Ejecutor {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int op = 0;
        int opCrear = 0;
        String nombre,ciudad,numCelular,modelo,cedula, marca,mb,cg,tb,minN,cMin,
                minI,cMinI,pDes;
       
        EnlacePlan plan = new EnlacePlan();
         int opcion_menu = 0;
         int opcion_menuPlnes = 0;
        PlanPostPagoMinutos ppgm1 = new PlanPostPagoMinutos();
        ArrayList<PlanPostPagoMinutos> listaPlanPostPagoMinutos = new ArrayList<>();
        PlanPostPagoMegas pppm1 = new PlanPostPagoMegas();
        ArrayList<PlanPostPagoMegas> listaPlanPostPagoMegas = new ArrayList<>();
        PlanPostPagoMinutosMegas pppmm1 = new PlanPostPagoMinutosMegas();
        ArrayList<PlanPostPagoMinutosMegas> listaPlanPostPagoMinutosMegas = new ArrayList<>();
        PlanPostPagoMinutosMegasEconomico pppmme1
                = new PlanPostPagoMinutosMegasEconomico();
        ArrayList<PlanPostPagoMinutosMegasEconomico> listaPlanPostPagoMinutosMegasEconomico = new ArrayList<>();
       do {
            try {
                opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "\tPLAN CELULAR\t\n"
                    + "[1] Crear tipos plan celular: \n"
                    + "[2] Mostrar datos\n"
                    + "[3] Salir\n\n"
                    + "Escoja una opcion valida: ?"));
                if (opcion_menu == 1) {
                opcion_menuPlnes = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "\tElija el tipo de plan celular\t\n"
                    + "[1] Plan Post Pago Megas: \n"
                    + "[2] Plan Post Pago Minutos\n"
                        + "[3] Plan Post Pago Minutos Megas\n"
                        + "[4] Plan Post Pago Minutos Megas Economico\n"
                    + "[5] Salir\n\n"
                    + "Escoja una opcion valida: ?"));

                switch (opcion_menu) {
                    case 1:
                         pppm1 = new PlanPostPagoMegas();
                        nombre = JOptionPane.showInputDialog("Ingrese nombre:");
                        pppm1.establecerNombrePropietario(nombre);
                         cedula = JOptionPane.showInputDialog("Ingrese cedula:");
                        pppm1.establecerCedula(cedula);
                        ciudad=JOptionPane.showInputDialog("Ingrese ciudad");
                        pppm1.establecerCiudad(ciudad);
                        modelo = JOptionPane.showInputDialog("Ingrese modelo de "
                                + "celular");
                        pppm1.establecerModelo(modelo);
                        marca = JOptionPane.showInputDialog("Ingrese marca de"
                                + "celular:");
                        pppm1.establecerMarca(marca);
                        numCelular=JOptionPane.showInputDialog("Ingrese numero "
                                + "celular:");
                        
                        pppm1.establecerNumerocelular(numCelular);
                        
                        mb = JOptionPane.showInputDialog("Ingrese la cantidad "
                                + "mb en gigas");
                        pppm1.establecerMegasGigas(Double.parseDouble(mb));
                        cg =JOptionPane.showInputDialog("Ingrese el costo de giga");
                
                        pppm1.establecerCostoporGiga(Double.parseDouble( cg));
                      
                        tb=JOptionPane.showInputDialog("Ingrese la tarifa base");
                        pppm1.establecerTarifaBase(Double.parseDouble(tb));
                        pppm1.calcularPagomensual();
                        plan.insertarPlanPostPagoMegas(pppm1);
                        break;
                    case 2:
                       ppgm1 = new PlanPostPagoMinutos();
                        nombre = JOptionPane.showInputDialog("Ingrese nombre:");
                        ppgm1.establecerNombrePropietario(nombre);
                         cedula = JOptionPane.showInputDialog("Ingrese cedula:");
                        ppgm1.establecerCedula(cedula);
                        ciudad=JOptionPane.showInputDialog("Ingrese ciudad");
                        ppgm1.establecerCiudad(ciudad);
                        modelo = JOptionPane.showInputDialog("Ingrese modelo de "
                                + "celular");
                        ppgm1.establecerModelo(modelo);
                        marca = JOptionPane.showInputDialog("Ingrese marca de"
                                + "celular:");
                        
                        ppgm1.establecerModelo(marca);
                         numCelular=JOptionPane.showInputDialog("Ingrese numero "
                                + "celular:");
                        ppgm1.establecerNumerocelular(numCelular);
                        minN = JOptionPane.showInputDialog("Ingrese minutos "
                                + "nacionales");
                        ppgm1.establecerMinutosNacionales(Double.parseDouble(minN));
                      
                        cMin = JOptionPane.showInputDialog("Ingrese costo "
                                + "minuto nacional");
                        ppgm1.establecerCostoMinutoNacional(Double.parseDouble(cMin));
                        
                        minI=JOptionPane.showInputDialog("Ingrese minutos "
                                + "internacionales");
                      
                        ppgm1.establecerMinutosInternacionales(Double.parseDouble(cMin));
                        cMinI = JOptionPane.showInputDialog("Ingrese costo "
                                + "minuto internacional");
                       
                        ppgm1.establecerCostoMinutoInternacioanl(Double.parseDouble(cMinI));
                        ppgm1.calcularPagomensual();
                        plan.insertarPlanPostPagoMinutos(ppgm1);
                       
                        break;
                    case 3:
                        pppmm1 = new PlanPostPagoMinutosMegas();
                        nombre = JOptionPane.showInputDialog("Ingrese nombre:");
                        pppmm1.establecerNombrePropietario(nombre);
                         cedula = JOptionPane.showInputDialog("Ingrese cedula:");
                        pppmm1.establecerCedula(cedula);
                        ciudad=JOptionPane.showInputDialog("Ingrese ciudad");
                        pppmm1.establecerCiudad(ciudad);
                        modelo = JOptionPane.showInputDialog("Ingrese modelo de "
                                + "celular");
                        pppmm1.establecerModelo(modelo);
                        marca = JOptionPane.showInputDialog("Ingrese marca de"
                                + "celular:");
                        pppmm1.establecerMarca(marca);
                        numCelular= JOptionPane.showInputDialog("Ingrese el "
                                + "numero de celular:");
                        pppmm1.establecerNumerocelular(numCelular);
                        minN =JOptionPane.showInputDialog("Ingrese los minutos:");
                        pppmm1.establecerMinutos(Double.parseDouble(minN));
                        cMin= JOptionPane.showInputDialog("Ingrese costo de minutos");
                        
                        pppmm1.establecerCostoMinutos(Double.parseDouble(cMin));
                        mb=JOptionPane.showInputDialog("Ingrese cantidad de mb"
                                + " en gigas");
                        pppmm1.establecerMegasGigas(Double.parseDouble(mb));
                        cg=JOptionPane.showInputDialog("Ingrese el costo de gb");
                        
                        pppmm1.establecerCostoporGiga(Double.parseDouble(cg));
                        pppmm1.calcularPagomensual();
                        plan.insertarPlanPostPagoMinutosMegas(pppmm1);
                        
                        break;
                    case 4:
                        pppmme1 = new PlanPostPagoMinutosMegasEconomico();
                        nombre = JOptionPane.showInputDialog("Ingrese nombre:");
                        pppmme1.establecerNombrePropietario(nombre);
                         cedula = JOptionPane.showInputDialog("Ingrese cedula:");
                        pppmme1.establecerCedula(cedula);
                        ciudad=JOptionPane.showInputDialog("Ingrese ciudad");
                        pppmme1.establecerCiudad(ciudad);
                        modelo = JOptionPane.showInputDialog("Ingrese modelo de "
                                + "celular");
                        pppmme1.establecerModelo(modelo);
                        marca = JOptionPane.showInputDialog("Ingrese marca de"
                                + "celular:");
                        pppmme1.establecerMarca(marca);
                        numCelular= JOptionPane.showInputDialog("Ingrese el "
                                + "numero de celular:");
                        pppmm1.establecerNumerocelular(numCelular);
                        minN =JOptionPane.showInputDialog("Ingrese los minutos:");
                        pppmme1.establecerMinutos(Double.parseDouble(minN));
                        cMin= JOptionPane.showInputDialog("Ingrese costo de minutos");
                        
                        pppmme1.establecerCostoMinutos(Double.parseDouble(cMin));
                        mb=JOptionPane.showInputDialog("Ingrese cantidad de mb"
                                + " en gigas");
                        pppmme1.establecerMegasGigas(Double.parseDouble(mb));
                        cg=JOptionPane.showInputDialog("Ingrese el costo de gb");
                        pppmme1.establecerCostoGigas(Double.parseDouble(cg));
                        pDes=JOptionPane.showInputDialog("Ingrese el porcentaje de descuento:");
                       
                        pppmme1.establecerPorcentajeDescuento(Double.parseDouble(pDes));
                        pppmme1.calcularPagomensual();
                        plan.insertarPlanPostPagoMinutosMegasEconomico(pppmme1);

                    case 5:
                        System.exit(0);
                        break;
                    default:
                       JOptionPane.showMessageDialog(null, 
                                "No existe el plan a crear", 
                                "Plan Celular", JOptionPane.WARNING_MESSAGE);
                }
            
            }
            if (opcion_menu == 2) {
                System.out.println("Planes Post Pago Megas");
                listaPlanPostPagoMegas = plan.obtenerDataPlanPostPagoMegas();
                for (PlanPostPagoMegas p : listaPlanPostPagoMegas) {
                    System.out.println(p);
                }
                listaPlanPostPagoMegas = new ArrayList<>();

                System.out.println("Planes Post Pago Minutos");
                listaPlanPostPagoMinutos = plan.obtenerDataPlanPostPagoMinutos();
                for (PlanPostPagoMinutos p : listaPlanPostPagoMinutos) {
                    System.out.println(p);
                }
                listaPlanPostPagoMinutos = new ArrayList<>();

                System.out.println("Planes Post Pago Minutos Megas");
                listaPlanPostPagoMinutosMegas = plan.obtenerDataPlanPostPagoMinutosMegas();
                for (PlanPostPagoMinutosMegas p : listaPlanPostPagoMinutosMegas) {
                    System.out.println(p);
                }
                listaPlanPostPagoMinutosMegas = new ArrayList<>();

                System.out.println("Planes Post Pago Minutos Megas Economico");
                listaPlanPostPagoMinutosMegasEconomico = plan.obtenerDataPlanPostPagoMinutosMegasEconomico();
                for (PlanPostPagoMinutosMegasEconomico p : listaPlanPostPagoMinutosMegasEconomico) {
                    System.out.println(p);
                }
                listaPlanPostPagoMinutosMegasEconomico = new ArrayList<>();
            }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "¡Dato valido!");
            }
        } while (opcion_menu != 4);
    }
}
     
       

        
                 
                       
                
            
            
       
       

