/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plancelular;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jeanpa
 */
public class Ejecutor {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int op = 0;
        int opCrear = 0;
        EnlacePlan plan = new EnlacePlan();
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
            System.out.println("1. Crear Plan");
            System.out.println("2. Mostrar Plan");
            System.out.println("3. Salir");
            op = Integer.parseInt(entrada.nextLine());

            if (op == 1) {
                System.out.println("--Seleccione Plan--");
                System.out.println("1.Plan Post Pago Megas");
                System.out.println("2.Plan Post Pago Minutos");
                System.out.println("3.Plan Post Pago Minutos Megas");
                System.out.println("4.Plan Post Pago Minutos Megas Economico");
                opCrear = Integer.parseInt(entrada.nextLine());
                switch (opCrear) {
                    case 1:
                        System.out.println("Ingrese nombre propietario");
                        pppm1.establecerNombrePropietario(entrada.nextLine());

                        System.out.println("Ingrese cedula propietario");
                        pppm1.establecerCedula(entrada.nextLine());
                        System.out.println("Ingrese la ciudad");
                        pppm1.establecerCiudad(entrada.nextLine());
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

//                    pppm1.establecerNombrePropietario("Gilbert Solano");
//                    pppm1.establecerCedula("1146659404");
//                    pppm1.establecerCiudad("Cuenca");
//                    pppm1.establecerModelo("8");
//                    pppm1.establecerMarca("iphone");
//                    pppm1.establecerNumerocelular("0987934783");
//                    pppm1.establecerMegasGigas(10);
//                    pppm1.establecerCostoporGiga(1);
//                    pppm1.establecerTarifaBase(10);
//                    pppm1.calcularPagomensual();
//                    plan.insertarPlanPostPagoMegas(pppm1);
                        break;
                    case 2:
                        System.out.println("Ingrese nombre propietario");
                        ppgm1.establecerNombrePropietario(entrada.nextLine());
                        System.out.println("Ingrese cedula propietario");
                        ppgm1.establecerCedula(entrada.nextLine());
                        System.out.println("Ingrese la ciudad");
                        ppgm1.establecerCiudad(entrada.nextLine());
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
                        pppmm1.establecerNombrePropietario(entrada.nextLine());
                        System.out.println("Ingrese cedula propietario");
                        pppmm1.establecerCedula(entrada.nextLine());
                        System.out.println("Ingrese la ciudad");
                        pppmm1.establecerCiudad(entrada.nextLine());
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
                        pppmme1.establecerNombrePropietario(entrada.nextLine());
                        System.out.println("Ingrese cedula propietario");
                        pppmme1.establecerCedula(entrada.nextLine());
                        System.out.println("Ingrese la ciudad");
                        pppmme1.establecerCiudad(entrada.nextLine());
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
                        System.out.println("No existe el plan a crear");
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
