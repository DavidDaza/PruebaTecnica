package com.serviaseo.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;

import com.serviaseo.model.BeanFactura;
import com.serviaseo.util.Conexion;





public class DaoFactura extends Conexion {
	
    private Statement statement = null;
    private String consulta = "";
	
	  /**
     * Constructor
     */
    public DaoFactura() {
        super();
        try {
            conexion = this.ObternerConexion();
            statement = conexion.createStatement();

        } catch (Exception e) {
        }

    }
	 /**
     * Metodo para gestionar facturas;
     *
     * @param beanPrenda
     * @return boleano
     */
    public boolean insertarFactura(BeanFactura factura) {

        PreparedStatement ps = null;
        try {
            String consulta = "CALL GestionFactura(?,?,?,?)";
           
			ps = conexion.prepareCall(consulta);

            ps.setInt(1, 1);
            ps.setString(2, factura.getDescripcion());
            ps.setInt(3, factura.getAccion_idAccion());
   

            if (ps.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error al insertar en la tabla" + e);
            System.out.println(e);

        }
        return false;
    }

}
