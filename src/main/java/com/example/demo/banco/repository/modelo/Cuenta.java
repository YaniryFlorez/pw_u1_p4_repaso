package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cuenta {
 private String numero;
 private String tipo;
 private BigDecimal saldo;
 private String cedulapropietario;
 private LocalDate fechaapertura;
 
 //SET y GET
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public BigDecimal getSaldo() {
	return saldo;
}
public void setSaldo(BigDecimal saldo) {
	this.saldo = saldo;
}
public String getCedulapropietario() {
	return cedulapropietario;
}
public void setCedulapropietario(String cedulapropietario) {
	this.cedulapropietario = cedulapropietario;
}
public LocalDate getFechaapertura() {
	return fechaapertura;
}
public void setFechaapertura(LocalDate fechaapertura) {
	this.fechaapertura = fechaapertura;
}

@Override
public String toString() {
	return "Cuenta [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", cedulapropietario="
			+ cedulapropietario + ", fechaapertura=" + fechaapertura + "]";
}
 
}
