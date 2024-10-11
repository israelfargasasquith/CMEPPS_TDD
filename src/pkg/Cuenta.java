package pkg;

import java.util.List;

public class Cuenta {

	private double saldo;
	private String numero;
	private String titular;
	private List<Movimiento> movimientos;
	
	
	public  Cuenta(double saldoInit,String numero,String titular) {
		saldo = saldoInit;
		this.titular = titular;
		this.numero = numero;
	}
	
	public  void ingresar(double ingreso) {
		saldo+=ingreso;
	}
	
	public  void retirar(double retirar) {
		saldo -= retirar;
	}
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
