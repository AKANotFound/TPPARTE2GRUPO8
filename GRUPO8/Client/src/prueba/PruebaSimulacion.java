package prueba;

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
		Rubro_ComercioLocal rubro_ComercioLocal = Rubro_ComercioLocal.getInstancia();                                                               
		Rubro_ComercioInternacional rubro_ComercioInternacional = Rubro_ComercioInternacional.getInstancia();                                       
		Rubro_Salud rubro_Salud = Rubro_Salud.getInstancia();                                                                                       
		                                                                                                                                            
		Locacion_HomeOffice locacion_HomeOffice = Locacion_HomeOffice.getInstancia();                                                               
		Locacion_Presencial locacion_Presencial = Locacion_Presencial.getInstancia();
		Locacion_Indistinto locacion_Indistinto = Locacion_Indistinto.getInstancia();
		
		Simulacion_EmpleadoPretenso ep1=new Simulacion_EmpleadoPretenso("juan facal" ,locacion_HomeOffice, rubro_ComercioLocal);
		Simulacion_EmpleadoPretenso ep2=new Simulacion_EmpleadoPretenso("milton sanchez" ,locacion_HomeOffice, rubro_ComercioInternacional);
		Simulacion_EmpleadoPretenso ep3=new Simulacion_EmpleadoPretenso("ivan gonzalez meier" ,locacion_Presencial, rubro_ComercioLocal);
		Simulacion_EmpleadoPretenso ep4=new Simulacion_EmpleadoPretenso("franco palmeiras" ,locacion_Presencial, rubro_Salud);
		Simulacion_EmpleadoPretenso ep5=new Simulacion_EmpleadoPretenso("tomas palmitano" ,locacion_Indistinto, rubro_Salud);
		Simulacion_EmpleadoPretenso ep6=new Simulacion_EmpleadoPretenso("franco sosa" ,locacion_Indistinto, rubro_ComercioInternacional);
		
		Simulacion_Empleador e1=new Simulacion_Empleador("Toledo");
		Simulacion_Empleador e2=new Simulacion_Empleador("Farmacity");		
		
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
