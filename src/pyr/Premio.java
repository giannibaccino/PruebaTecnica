package pyr;

public class Premio {
	private int monto;

	public Premio(int monto) {
		super();
		this.monto = monto;
	}
	
	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getMonto() {
		return monto;
	}

	public void sumarMonto(int monto) {
		this.monto = this.monto + monto;
	}
	
	public void reiniciarMonto() {
		this.monto = 0;
	}
	
	public int premioDeNivel(int nivel) { // Se fija el premio de cada nivel en esta clase
		int lvlp = 0;
		switch (nivel) {
			case 1: 
				lvlp = 100;
				break;
			case 2:
				lvlp = 200;
				break;
			case 3:
				lvlp = 300;
				break;
			case 4:
				lvlp = 400;
				break;
			case 5:
				lvlp = 500;
				break;
		}
		return lvlp;
	}
}
