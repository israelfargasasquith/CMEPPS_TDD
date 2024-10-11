package pkg;

public class Movimiento {
	
	private enum Signo{
		D,
		H
	}

	
	private double importe;
	private String detalle;
	private Signo signo;
	
	public double getImporte() {
		return importe;
	}

	public String getDetalle() {
		return detalle;
	}


}
