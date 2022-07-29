/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plancelular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jeanpa
 */
public class EnlacePlan {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/baseplancelular.db";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMegas(PlanPostPagoMegas pppm) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planpostpagomegas (nombre, "
                    + "cedula, ciudad, modelo, marca, numerocelular, cantidadgb,"
                    + " costogb, tarifabase, pagoplan ) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', %s, %s, %s, %s);",
                    pppm.obtenerPropietario().obtenerNombre(),
                    pppm.obtenerPropietario().obtenerIdentidad(),
                    pppm.obtenerPropietario().obtenerIdentidad(),
                    pppm.obtenerModelo(),
                    pppm.obtenerMarca(),
                    pppm.obtenerNumerocelular(),
                    pppm.obtenerMegasGigas(),
                    pppm.obtenerCostoporGiga(),
                    pppm.obtenerTarifaBase(),
                    pppm.obtenerPagomensual());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:" + e);
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos pppmi) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planpostpagominutos "
                    + "(nombre, cedula, ciudad, modelo, marca, numerocelular, "
                    + "minutosNacionales, costoMinutoNacional,"
                    + " minutosInternacionales, costoMinutoInternacional,"
                    + " pagoplan ) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', %s, %s, %s,"
                    + " %s, %s);",
                    pppmi.obtenerPropietario().obtenerNombre(),
                    pppmi.obtenerPropietario().obtenerIdentidad(),
                    pppmi.obtenerPropietario().obtenerCiudad(),
                    pppmi.obtenerModelo(),
                    pppmi.obtenerMarca(),
                    pppmi.obtenerNumerocelular(),
                    pppmi.obtenerMinutosNacionales(),
                    pppmi.obtenerCostoMinutoNacional(),
                    pppmi.obtenerMinutosInternacionales(),
                    pppmi.obtenerCostoMinutoInternacioanl(),
                    pppmi.obtenerPagomensual());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:" + e);
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas pppmm) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planpostpagominutosmegas (nombre, cedula, ciudad, modelo, marca, numerocelular, minutos, costominutos, cantidadgb, costogb, pagoplan ) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', %s, %s, %s, %s, %s);",
                    pppmm.obtenerPropietario().obtenerNombre(),
                    pppmm.obtenerPropietario().obtenerIdentidad(),
                    pppmm.obtenerPropietario().obtenerCiudad(),
                    pppmm.obtenerModelo(),
                    pppmm.obtenerMarca(),
                    pppmm.obtenerNumerocelular(),
                    pppmm.obtenerMinutos(),
                    pppmm.obtenerCostoMinutos(),
                    pppmm.obtenerMegasGigas(),
                    pppmm.obtenerCostoporGiga(),
                    pppmm.obtenerPagoMensual());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:" + e);
            System.out.println(e.getMessage());

        }
    }
    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico pppmme) {

        try {
           
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planpostpagominutosmegaseconomico (nombre, cedula, ciudad, modelo, marca, numerocelular, minutos, costominutos, cantidadgb, costogb, porcentajedescuento, pagoplan ) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', %s, %s, %s, %s, %s, %s);",
                    pppmme.obtenerPropietario().obtenerNombre(),
                    pppmme.obtenerPropietario().obtenerIdentidad(),
                    pppmme.obtenerPropietario().obtenerCiudad(),
                    pppmme.obtenerModelo(),
                    pppmme.obtenerMarca(),
                    pppmme.obtenerNumerocelular(),
                    pppmme.obtenerMinutos(),
                    pppmme.obtenerCostoMinutos(),
                    pppmme.obtenerMegasGigas(),
                    pppmme.obtenerCostoGigas(),
                    pppmme.obtenerPorcentajeDescuento(),
                    pppmme.obtenerPagomensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:" + e);
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanPostPagoMinutos() {
        ArrayList<PlanPostPagoMinutos> listaPlanPostPagoMinutos = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planpostpagominutos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                PlanPostPagoMinutos pppmi = new PlanPostPagoMinutos();

                pppmi.propietario.establecerNombre(rs.getString("nombre"));
                pppmi.propietario.establecerIdentidad(rs.getInt("cedula"));
                pppmi.propietario.establecerCiudad(rs.getString("ciudad"));
                pppmi.establecerModelo(rs.getString("modelo"));
                pppmi.establecerMarca(rs.getString("marca"));
                pppmi.establecerNumerocelular(rs.getString("numerocelular"));
                pppmi.establecerMinutosNacionales(rs.getDouble("minutosNacionales"));
                pppmi.establecerCostoMinutoNacional(rs.getDouble("costoMinutoNacional"));
                pppmi.establecerMinutosInternacionales(rs.getDouble("minutosInternacionales"));
                pppmi.establecerCostoMinutoInternacioanl(rs.getDouble("costoMinutoInternacional"));
                pppmi.establecerPagoMensual(rs.getDouble("pagoplan"));
                listaPlanPostPagoMinutos.add(pppmi);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: Error");
            System.out.println(e.getMessage());

        }
        return listaPlanPostPagoMinutos;
    }

    public ArrayList<PlanPostPagoMegas> obtenerDataPlanPostPagoMegas() {
        ArrayList<PlanPostPagoMegas> listaPlanPostPagoMegas = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planpostpagomegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                PlanPostPagoMegas pppm = new PlanPostPagoMegas();

                pppm.propietario.establecerNombre(rs.getString("nombre"));
                pppm.propietario.establecerIdentidad(rs.getInt("cedula"));
                pppm.propietario.establecerCiudad(rs.getString("ciudad"));
                pppm.establecerModelo(rs.getString("modelo"));
                pppm.establecerMarca(rs.getString("marca"));
                pppm.establecerNumerocelular(rs.getString("numerocelular"));
                pppm.establecerMegasGigas(rs.getDouble("cantidadgb"));
                pppm.establecerCostoporGiga(rs.getDouble("costogb"));
                pppm.establecerPagoMensual(rs.getDouble("pagoplan"));
                listaPlanPostPagoMegas.add(pppm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: Error");
            System.out.println(e.getMessage());

        }
        return listaPlanPostPagoMegas;
    }
    public ArrayList<PlanPostPagoMinutosMegas> obtenerDataPlanPostPagoMinutosMegas() {
        ArrayList<PlanPostPagoMinutosMegas> listaPlanPostPagoMinutosMegas = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planpostpagominutosmegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                PlanPostPagoMinutosMegas pppmm = new PlanPostPagoMinutosMegas();

                pppmm.propietario.establecerNombre(rs.getString("nombre"));
                pppmm.propietario.establecerIdentidad(rs.getInt("cedula"));
                pppmm.propietario.establecerCiudad(rs.getString("ciudad"));
                pppmm.establecerModelo(rs.getString("modelo"));
                pppmm.establecerMarca(rs.getString("marca"));
                pppmm.establecerNumerocelular(rs.getString("numerocelular"));
                pppmm.establecerMinutos(rs.getDouble("minutos"));
                pppmm.establecerCostoMinutos(rs.getDouble("costominutos"));
                pppmm.establecerMegasGigas(rs.getDouble("cantidadgb"));
                pppmm.establecerCostoporGiga(rs.getDouble("costogb"));
                pppmm.establecerPagoMensual(rs.getDouble("pagoplan"));
               
                listaPlanPostPagoMinutosMegas.add(pppmm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: Error");
            System.out.println(e.getMessage());

        }
        return listaPlanPostPagoMinutosMegas;
    }
    public ArrayList<PlanPostPagoMinutosMegasEconomico> 
        obtenerDataPlanPostPagoMinutosMegasEconomico() {
        ArrayList<PlanPostPagoMinutosMegasEconomico> 
                listaPlanPostPagoMinutosMegasEconomico = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planpostpagominutosmegaseconomico;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                PlanPostPagoMinutosMegasEconomico pppmme = new 
        PlanPostPagoMinutosMegasEconomico();

                pppmme.propietario.establecerNombre(rs.getString("nombre"));
                pppmme.propietario.establecerIdentidad(rs.getInt("cedula"));
                pppmme.propietario.establecerCiudad(rs.getString("ciudad"));
                pppmme.establecerModelo(rs.getString("modelo"));
                pppmme.establecerMarca(rs.getString("marca"));
                pppmme.establecerNumerocelular(rs.getString("numerocelular"));
                pppmme.establecerMinutos(rs.getDouble("minutos"));
                pppmme.establecerCostoMinutos(rs.getDouble("costominutos"));
                pppmme.establecerMegasGigas(rs.getDouble("cantidadgb"));
                pppmme.establecerCostoGigas(rs.getDouble("costogb"));
                pppmme.establecerPorcentajeDescuento(rs.getDouble("porcentajedescuento"));
                pppmme.establecerPagoMensual(rs.getDouble("pagoplan"));
                listaPlanPostPagoMinutosMegasEconomico.add(pppmme);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: Error");
            System.out.println(e.getMessage());

        }
        return listaPlanPostPagoMinutosMegasEconomico;
    }

}
