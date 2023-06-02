package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaRepository {

	public void crearCuenta(Cuenta cuenta);
	public Cuenta buscarCuenta(String numero);
	public void ActualizarCuenta(Cuenta cuenta);
	public void eliminarCuenta(String numero);

	
}
