package com.example.demo.service;

import com.example.demo.banco.repository.modelo.Cuenta;

public interface CuentaService {
	public void nuevaCuenta(Cuenta cuenta);
	public Cuenta buscarCuenta(String numero);
	public void ActualizarCuenta(Cuenta cuenta);
	public void borrarCuenta(String numero);
}
