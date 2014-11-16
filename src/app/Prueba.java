package app;


import interfaz.InterfazEnvios;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

//Con RMI no deberia ir



public class Prueba {

	//DAMIAN RMI
	InterfazEnvios iE=null;

	public static void main(String[] args)
	{
		new Prueba();
	}

	public boolean getStub() {

		try {
			iE = (InterfazEnvios)Naming.lookup ("//localhost/Envios");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Prueba(){
		if(getStub()) 
		{
			try {



				iE.altaParticular("salta 1234", "543523", "Pepe", "Garcia", "32243243");
				iE.altaParticular("salta 1234", "41233", "Damian", "M", "34554567");
				iE.altaEmpresa("DirEmpresa","3432423","Razon01","cuit01","Regular");
				iE.altaEmpresa("DirEmpresa2","999999","Razon02","cuit02","Regular");
				iE.altaProducto("TipoComun", "1kg de cocaina", "cuit01");
				iE.altaProducto("TipoComun", "caja de absenta", "cuit01");
				iE.agregarEmpresaDireccionValida("DireccionValida 01","54654645","cuit01");
				iE.altaSucursal("sucursal1","Direccion1","Gerente1","EncDespacho1","EncRecep1");
				iE.altaSucursal("sucursal2","Direccion2","Gerente2","EncDespacho2","EncRecep2");


				iE.altaDeposito(500, "EncDeposito1", "sucursal1");
				iE.altaDeposito(1000, "EncDeposito2", "sucursal1");
				iE.altaDeposito(1500, "EncDeposito3", "sucursal1");
				iE.altaDeposito(500, "EncDeposito4", "sucursal1");


				iE.altaCuentaCorriente(999999, 0, 5000, "cuit01");			
				iE.altaMovimientoCuenta(null, 500, 999999);


			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}

}
