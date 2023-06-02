package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Cuenta;

@Repository
public class CuentaRepositoryImpl implements CuentaRepository{
	
	private static List<Cuenta> baseDatos= new ArrayList<Cuenta>();
	

	@Override
	public void crearCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		baseDatos.add(cuenta);
		
	}

	

	@Override
	public void ActualizarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.eliminarCuenta(cuenta.getNumero());
		baseDatos.add(cuenta);
		
	}
	
	
	@Override
	public Cuenta buscarCuenta(String numero) {
		// TODO Auto-generated method stub
		Cuenta cuentaEncontrado=new Cuenta();
		
		for(Cuenta cuenta:baseDatos) {
			if(numero.equals(cuenta.getNumero())) {
				cuentaEncontrado=cuenta;
				
			}
			
		}
		return cuentaEncontrado;
	}

	
	@Override
	public void eliminarCuenta(String numero) {
		Cuenta cuenta=this.buscarCuenta(numero);
		baseDatos.remove(cuenta);
		
		
	}

}
