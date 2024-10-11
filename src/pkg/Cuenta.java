package pkg;

public class Cuenta {

	private double saldo;
	
	
	public  Cuenta(double saldoInit) {
		saldo = saldoInit;
	}
	
	public  void ingresar(double ingreso) {
		saldo+=ingreso;
	}
	
	public  void retirar(double retirar) {
		saldo -= retirar;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
