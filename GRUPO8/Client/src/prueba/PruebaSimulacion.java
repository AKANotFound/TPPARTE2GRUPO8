package prueba;

import entidades.BolsaDeTrabajo;
import entidades.Rubro_ComercioInternacional;
import entidades.Rubro_ComercioLocal;
import entidades.Rubro_Salud;
import entidades.Simulacion_EmpleadoPretenso;
import entidades.Simulacion_Empleador;
import tablas.Locacion_HomeOffice;
import tablas.Locacion_Indistinto;
import tablas.Locacion_Presencial;

public class PruebaSimulacion
{

	public static void main(String[] args)
	{
		Simulacion_EmpleadoPretenso ep1=new Simulacion_EmpleadoPretenso("juan facal" ,new Locacion_HomeOffice(), new Rubro_ComercioLocal());
		Simulacion_EmpleadoPretenso ep2=new Simulacion_EmpleadoPretenso("milton sanchez" ,new Locacion_HomeOffice(), new Rubro_ComercioInternacional());
		Simulacion_EmpleadoPretenso ep3=new Simulacion_EmpleadoPretenso("ivan gonzalez meier" ,new Locacion_Presencial(), new Rubro_ComercioLocal());
		Simulacion_EmpleadoPretenso ep4=new Simulacion_EmpleadoPretenso("franco palmeiras" ,new Locacion_Presencial(), new Rubro_Salud());
		Simulacion_EmpleadoPretenso ep5=new Simulacion_EmpleadoPretenso("tomas palmitano" ,new Locacion_Indistinto(), new Rubro_Salud());
		Simulacion_EmpleadoPretenso ep6=new Simulacion_EmpleadoPretenso("franco sosa" ,new Locacion_Indistinto(), new Rubro_ComercioInternacional());
		
		Simulacion_Empleador e1=new Simulacion_Empleador("Toledo");
		Simulacion_Empleador e2=new Simulacion_Empleador("Farmacity");
		
		BolsaDeTrabajo bolsaDeTrabajo=BolsaDeTrabajo.getInstancia();
		
		ep1.agregarObservable(bolsaDeTrabajo);
		ep2.agregarObservable(bolsaDeTrabajo);
		ep3.agregarObservable(bolsaDeTrabajo);
		ep4.agregarObservable(bolsaDeTrabajo);
		ep5.agregarObservable(bolsaDeTrabajo);
		ep6.agregarObservable(bolsaDeTrabajo);
		
		
		Thread t1=new Thread(ep1);
		Thread t2=new Thread(ep2);
		Thread t3=new Thread(ep3);
		Thread t4=new Thread(ep4);
		Thread t5=new Thread(ep5);
		Thread t6=new Thread(ep6);
		Thread t7=new Thread(e1);
		Thread t8=new Thread(e2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		
	}

}
