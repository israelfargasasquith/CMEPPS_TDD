package pkg;

public class Cuenta {

	private int saldo;
	
	public  Cuenta(int saldoInit) {
		saldo = saldoInit;
	}
	
	public  void ingresar(int ingreso) {
		saldo+=ingreso;
	}
	
	public  void retirar(int retirar) {
		saldo -= retirar;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
}
