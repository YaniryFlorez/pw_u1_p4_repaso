package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepository{
	
	private static List<Transferencia> baseDatos = new ArrayList<>();
	

	@Override
	public void crearTransfe(Transferencia transferencia) {
		// TODO Auto-generated method stub
		baseDatos.add(transferencia);
		
	}

	@Override
	public void actualizarTransfe(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.eliminarTransfe(transferencia.getNumero());
		baseDatos.add(transferencia);

	}

	@Override
	public Transferencia buscarTransfe(String numero) {
		Transferencia transfencontado=new Transferencia();
		for(Transferencia transferencia:baseDatos) {
			if(numero.equals(transferencia.getNumero())){
				transfencontado=transferencia;
				
			}
		}
		return transfencontado;
	}

	@Override
	public void eliminarTransfe(String numero) {
		Transferencia transfe=this.buscarTransfe(numero);
		baseDatos.remove(transfe);
		
	}

	@Override
	public List<Transferencia> mostrarTodasTransfe() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
