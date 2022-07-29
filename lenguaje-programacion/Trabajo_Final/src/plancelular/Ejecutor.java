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

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int op = 0;
        int opCrear = 0;
        String nombre;
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
                
                switch (opcion_menuPlnes) {
                    case 1:
                        
                      
nombre = JOptionPane.showInputDialog("Escribe tu nombre");
                        pppm1.propietario.establecerNombre(nombre);
                        
                        System.out.println("Ingrese cedula propietario");
                        pppm1.propietario.establecerIdentidad(entrada.nextInt());
                        System.out.println("Ingrese la ciudad");
                        pppm1.propietario.establecerCiudad(entrada.nextLine());
                        System.out.println("Ingrese modelo de celular");
                        pppm1.establecerModelo(entrada.nextLine());
                        System.out.println("Ingrese marca de celular");
                        pppm1.establecerMarca(entrada.nextLine());
                        System.out.println("Ingrese numero de celular");
                        pppm1.establecerNumerocelular(entrada.nextLine());
                        System.out.println("Ingrese la cantidad mb en gigas");
                        pppm1.establecerMegasGigas(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese el costo de giga");
                        pppm1.establecerCostoporGiga(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese la tarifa base");
                        pppm1.establecerTarifaBase(Double.parseDouble(entrada.nextLine()));
                        pppm1.calcularPagomensual();
                        plan.insertarPlanPostPagoMegas(pppm1);

                        pppm1 = new PlanPostPagoMegas();


                        break;
                    case 2:
                        System.out.println("Ingrese nombre propietario");
                        ppgm1.propietario.establecerNombre(entrada.nextLine());
                        System.out.println("Ingrese cedula propietario");
                        ppgm1.propietario.establecerIdentidad(entrada.nextInt());
                        System.out.println("Ingrese la ciudad");
                        ppgm1.propietario.establecerCiudad(entrada.nextLine());
                        System.out.println("Ingrese modelo de celular");
                        ppgm1.establecerMarca(entrada.nextLine());
                        System.out.println("Ingrese marca de celular");
                        ppgm1.establecerModelo(entrada.nextLine());
                        System.out.println("Ingrese numero de celular");
                        ppgm1.establecerNumerocelular(entrada.nextLine());
                        System.out.println("Ingrese minutos nacionales");
                        ppgm1.establecerMinutosNacionales(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese costo minuto nacional");
                        ppgm1.establecerCostoMinutoNacional(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese minutos internacionales");
                        ppgm1.establecerMinutosInternacionales(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese costo minuto internacional");
                        ppgm1.establecerCostoMinutoInternacioanl(Double.parseDouble(entrada.nextLine()));
                        ppgm1.calcularPagomensual();
                        plan.insertarPlanPostPagoMinutos(ppgm1);
                        ppgm1 = new PlanPostPagoMinutos();
                        break;
                    case 3:
                        System.out.println("Ingrese nombre propietario");
                        pppmm1.propietario.establecerNombre(entrada.nextLine());
                        System.out.println("Ingrese cedula propietario");
                        pppmm1.propietario.establecerIdentidad(entrada.nextInt());
                        System.out.println("Ingrese la ciudad");
                        pppmm1.propietario.establecerCiudad(entrada.nextLine());
                        System.out.println("Ingrese modelo de celular");
                        pppmm1.establecerModelo(entrada.nextLine());
                        System.out.println("Ingrese marca de celular");
                        pppmm1.establecerMarca(entrada.nextLine());
                        System.out.println("Ingrese numero de celular");
                        pppmm1.establecerNumerocelular(entrada.nextLine());
                        System.out.println("Ingrese los minutos");
                        pppmm1.establecerMinutos(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese costo de minutos");
                        pppmm1.establecerCostoMinutos(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese cantidad mb en gigas");
                        pppmm1.establecerMegasGigas(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese el costo de gb");
                        pppmm1.establecerCostoporGiga(Double.parseDouble(entrada.nextLine()));
                        pppmm1.calcularPagomensual();
                        plan.insertarPlanPostPagoMinutosMegas(pppmm1);
                        pppmm1 = new PlanPostPagoMinutosMegas();
                        break;
                    case 4:
                        System.out.println("Ingrese nombre propietario");
                        pppmme1.propietario.establecerNombre(entrada.nextLine());
                        System.out.println("Ingrese cedula propietario");
                        pppmme1.propietario.establecerIdentidad(entrada.nextInt());
                        System.out.println("Ingrese la ciudad");
                        pppmme1.propietario.establecerCiudad(entrada.nextLine());
                        System.out.println("Ingrese modelo de celular");
                        pppmme1.establecerModelo(entrada.nextLine());
                        System.out.println("Ingrese marca de celular");
                        pppmme1.establecerMarca(entrada.nextLine());
                        System.out.println("Ingrese numero de celular");
                        pppmme1.establecerNumerocelular(entrada.nextLine());
                        System.out.println("Ingrese los minutos");
                        pppmme1.establecerMinutos(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese costo de minutos");
                        pppmme1.establecerCostoMinutos(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese cantidad mb en gigas");
                        pppmme1.establecerMegasGigas(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese el costo de gb");
                        pppmme1.establecerCostoGigas(Double.parseDouble(entrada.nextLine()));
                        System.out.println("Ingrese el porcentaje de descuento");
                        pppmme1.establecerPorcentajeDescuento(Double.parseDouble(entrada.nextLine()));
                        pppmme1.calcularPagomensual();
                        plan.insertarPlanPostPagoMinutosMegasEconomico(pppmme1);

                        pppmme1 = new PlanPostPagoMinutosMegasEconomico();
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, 
                                "No existe el plan a crear", 
                                "Plan Celular", JOptionPane.WARNING_MESSAGE);
                       
                }
            }
            if (op == 2) {
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

        } while (op > 3);

    }   

}
