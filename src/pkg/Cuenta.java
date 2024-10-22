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
		System.out.println("Ingreso de "+ingreso+" la cuenta queda como "+saldo+ " de la cuenta "+numero);
		movimientos.add(new Movimiento(ingreso,"",Movimiento.Signo.D));
	}
	
	public  void retirar(double retirar) {
		if((saldo-retirar)>=-500d) {
		saldo -= retirar;
		System.out.println("Retirada de "+retirar+" la cuenta queda como "+saldo+" de la cuenta "+numero);
		movimientos.add(new Movimiento(retirar,"",Movimiento.Signo.H));
		}else {
			System.out.println("Error: No se puede retirar, fondos insuficientes");
		}
	}
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
