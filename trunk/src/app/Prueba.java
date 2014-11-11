package app;


import interfaz.InterfazEnvios;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import rmi.EnviosRMI;

//Con RMI no deberia ir
import dao.DAOCliente;
import dao.entities.*;


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
    			
    			
    			
//    			iE.altaParticular("salta 1234", "543523", "Pepe", "Garcia", "32243243");
//    			iE.altaParticular("salta 1234", "41233", "Damian", "M", "34554567");
    			iE.altaEmpresa("DirEmpresa","3432423","Razon01","cuit01","Regular");
    			
    			
    			//falla al ingresar 2do Empresa. Clientes funciona
    			iE.altaEmpresa("DirEmpresa2","999999","Razon02","cuit02","Regular");
    			
//    			
//    			iE.altaCuentaCorriente(999999, 0, 5000, "cuit01");
//    			
//    			iE.altaProducto("TipoComun", "1kg de cocaina", "cuit01");
//    			iE.altaProducto("TipoComun", "caja de absenta", "cuit01");
//    			iE.altaMovimientoCuenta(null, 500, 999999);
//    			iE.agregarEmpresaDireccionValida("DireccionValida 01","54654645","cuit01");
    			
    			
    		} catch (RemoteException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	} 
    }
	
	
	

	
	
	//RODRIGO

//	private static void AltaDatos() {
//		
//		
//		dao.entities.Empresa emp = new dao.entities.Empresa("Dir", "232323", "Empresa1", "200202020", "Regular");
//		emp.addDireccioneValida(new EmpresaDirValidas ("DirValida1", emp));
//		emp.addDireccioneValida(new EmpresaDirValidas ("DirValida2", emp));
//		
//		emp.addProductoValido(new Producto("Caja", "Bombones", emp));
//		emp.addProductoValido(new Producto("Caja", "Sandwiches", emp));
//		
//		CuentaCorriente cuenta= new CuentaCorriente(12345,100, 50, true,emp);
//		cuenta.addMovimiento(new MovimientoCuenta(null, 10,cuenta));
//		
//		emp.addCuentaCorriente(cuenta);
//
//
//		DAOCliente.getInstance().persistir(new dao.entities.Particular("Dir", "202020", "Pepe", "Lopez", 33333));
//		DAOCliente.getInstance().persistir(new dao.entities.Particular("Di2r", "202020", "Luis", "Lopez", 33334));
//		DAOCliente.getInstance().persistir(emp);
//		
//
//	}





}
