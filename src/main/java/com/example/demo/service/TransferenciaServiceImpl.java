package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.TransferenciaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService{
	@Autowired
	private TransferenciaRepository transferenciaRepository;
	
	@Autowired
	private CuentaRepository cuentaRepository;
	

	@Override
	public void nuevaTransfe(Transferencia transferencia) {
		this.transferenciaRepository.crearTransfe(transferencia);
		
	}

	@Override
	public void actualizarTransfe(Transferencia transferencia) {
		this.transferenciaRepository.actualizarTransfe(transferencia);
		
	}

	@Override
	public Transferencia buscarTransfe(String numero) {
		
		return this.transferenciaRepository.buscarTransfe(numero);
	}

	@Override
	public void borrarTransfe(String numero) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.eliminarTransfe(numero);
	}

	@Override
	public List<Transferencia> mostrarTodasTransfe() {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.mostrarTodasTransfe();
	}

	@Override
	public void realizarTransfe(String cuentaorigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		Cuenta cuentaorigen=this.transferenciaRepository.
	}

}
