package simulacion;

import controlador.ControladorVistaSimulacion;
import entidades.BolsaDeTrabajo;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import entidades.Rubro_Salud;
import entidades.Simulacion_EmpleadoPretenso;
import entidades.Simulacion_Empleador;
import tablas.Locacion_HomeOffice;
import tablas.Locacion_Indistinto;
import tablas.Locacion_Presencial;

public class Simulacion {

	private static Simulacion instancia = null;
	private Thread t1;
	private Thread t2;
	private Thread t3;
	private Thread t4;
	private Thread t5;
	private Thread t6;
	private Thread t7;
	private Thread t8;
	private Thread t9;
	private Thread t10;

	public static Simulacion getInstancia() {
		if (instancia == null)
			instancia = new Simulacion();
		return instancia;
	}

	public void simulacion(ControladorVistaSimulacion c) {

		Rubro_ComercioLocal rubro_ComercioLocal = new Rubro_ComercioLocal();
		Rubro_ComercioInternacional rubro_ComercioInternacional = new Rubro_ComercioInternacional();
		Rubro_Salud rubro_Salud = new Rubro_Salud();

		Locacion_HomeOffice locacion_HomeOffice = new Locacion_HomeOffice();
		Locacion_Presencial locacion_Presencial = new Locacion_Presencial();
		Locacion_Indistinto locacion_Indistinto = new Locacion_Indistinto();

		Simulacion_EmpleadoPretenso ep1 = new Simulacion_EmpleadoPretenso("juan facal", locacion_HomeOffice,
				rubro_ComercioLocal);
		Simulacion_EmpleadoPretenso ep2 = new Simulacion_EmpleadoPretenso("milton sanchez", locacion_HomeOffice,
				rubro_ComercioInternacional);
		Simulacion_EmpleadoPretenso ep3 = new Simulacion_EmpleadoPretenso("ivan gonzalez meier", locacion_Presencial,
				rubro_ComercioLocal);
		Simulacion_EmpleadoPretenso ep4 = new Simulacion_EmpleadoPretenso("franco palmeiras", locacion_Presencial,
				rubro_Salud);
		Simulacion_EmpleadoPretenso ep5 = new Simulacion_EmpleadoPretenso("tomas palmitano", locacion_Indistinto,
				rubro_Salud);
		Simulacion_EmpleadoPretenso ep6 = new Simulacion_EmpleadoPretenso("franco sosa", locacion_Indistinto,
				rubro_ComercioInternacional);

		Simulacion_Empleador e1 = new Simulacion_Empleador("Toledo");
		Simulacion_Empleador e2 = new Simulacion_Empleador("Farmacity");
		Simulacion_Empleador e3 = new Simulacion_Empleador("Musimundo");
		Simulacion_Empleador e4 = new Simulacion_Empleador("Disco");

		c.agregarObservable(ep1);
		c.agregarObservable(ep2);
		c.agregarObservable(ep3);
		c.agregarObservable(ep4);
		c.agregarObservable(ep5);
		c.agregarObservable(ep6);

		c.agregarObservable(e1);
		c.agregarObservable(e2);
		c.agregarObservable(e3);
		c.agregarObservable(e4);

		BolsaDeTrabajo.getInstancia().iniciaSimulacion();

		t1 = new Thread(ep1);
		t2 = new Thread(ep2);
		t3 = new Thread(ep3);
		t4 = new Thread(ep4);
		t5 = new Thread(ep5);
		t6 = new Thread(ep6);
		t7 = new Thread(e1);
		t8 = new Thread(e2);
		t9 = new Thread(e3);
		t10 = new Thread(e4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();

	}

	public void iniciar() 
	{
		BolsaDeTrabajo.getInstancia().iniciaSimulacion();
	}

	public void detener() 
	{
		BolsaDeTrabajo.getInstancia().finalizarSimulacion();
		t1.stop();
		t2.stop();
		t3.stop();
		t4.stop();
		t5.stop();
		t6.stop();
		t7.stop();
		t8.stop();
		t9.stop();
		t10.stop();
	}
}
