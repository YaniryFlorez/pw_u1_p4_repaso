package com.example.demo.banco.repository;

import java.util.List;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaRepository {
	
	public void crearTransfe(Transferencia transferencia);
	public void actualizarTransfe(Transferencia transferencia);
	public Transferencia buscarTransfe(String numero);
	public void eliminarTransfe(String numero);
	public List<Transferencia> mostrarTodasTransfe();
	

}
