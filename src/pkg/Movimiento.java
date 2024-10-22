package pkg;

public class Movimiento {
	
	 enum Signo{
		D,
		H
	}

	
	private double importe;
	private String detalle;
	private Signo signo;
	
	public Movimiento(double importe, String detalle, Signo signo) {
		this.importe = importe;
		this.detalle = detalle;
		this.signo = signo;
	}
	
	public double getImporte() {
		return importe;
	}

	public String getDetalle() {
		return detalle;
	}
	
	public Signo getSigno() {
		return signo;
	}


}
