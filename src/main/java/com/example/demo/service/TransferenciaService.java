package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaService {

	public void nuevaTransfe(Transferencia transferencia);
	public void actualizarTransfe(Transferencia transferencia);
	public Transferencia buscarTransfe(String numero);
	public void borrarTransfe(String numero);
	
	public void realizarTransfe(String cuentaorigen, String cuentaDestino, BigDecimal monto);
	
	public List<Transferencia> mostrarTodasTransfe();
}
