package pkg;

import java.util.ArrayList;
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
		this.movimientos = new ArrayList<Movimiento>();
	}
	
	public  void ingresar(double ingreso) {
		saldo+=ingreso;
		movimientos.add(new Movimiento(ingreso,"",Movimiento.Signo.D));
	}
	
	public  void retirar(double retirar) {
		saldo -= retirar;
		movimientos.add(new Movimiento(retirar,"",Movimiento.Signo.H));
	}
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
