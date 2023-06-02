package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transferencia {
 private String numero;
 private BigDecimal monto;
 private LocalDate fecha;
 private String cuentaOrigen;
 private String cuentaDestino;
 
 //SET Y GET
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public BigDecimal getMonto() {
	return monto;
}
public void setMonto(BigDecimal monto) {
	this.monto = monto;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public String getCuentaOrigen() {
	return cuentaOrigen;
}
public void setCuentaOrigen(String cuentaOrigen) {
	this.cuentaOrigen = cuentaOrigen;
}
public String getCuentaDestino() {
	return cuentaDestino;
}
public void setCuentaDestino(String cuentaDestino) {
	this.cuentaDestino = cuentaDestino;
}
@Override
public String toString() {
	return "Transferencia [numero=" + numero + ", monto=" + monto + ", fecha=" + fecha + ", cuentaOrigen="
			+ cuentaOrigen + ", cuentaDestino=" + cuentaDestino + "]";
}
 
 

}
