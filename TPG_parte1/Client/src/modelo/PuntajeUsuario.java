package modelo;

public class PuntajeUsuario {
	private int puntaje;
	
	public PuntajeUsuario() {
		super();
		this.puntaje = 0;
	}
	
	public int getPuntaje() {
		return puntaje;
	}

	public void finalizarTicketEmpleador() {
		this.puntaje += 50;
	}
	public void primerEmpleador() {
		this.puntaje += 10;
	}
	public void cancelarTicket() {
		this.puntaje -= 1;
	}
	public void finalizarTicketEmpleadoPretenso() {
		this.puntaje += 10;
	}
	public void ultimoEmpleadoPretenso() {
		this.puntaje -= 5;
	}
	public void primerEmpleadoPretenso() {
		this.puntaje += 5;
	}
}
