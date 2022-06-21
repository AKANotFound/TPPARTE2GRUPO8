package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistenciaBin implements IPersistencia <Serializable>{
	
	private FileInputStream fileinput;
	private FileOutputStream fileoutput;
	private ObjectInputStream objectinput;
	private ObjectOutputStream objectoutput;
	
	public FileInputStream getFileinput() {
		return this.fileinput;
	}

	@Override
	public void abrirInput(String nombre) throws IOException {
		this.fileinput = new FileInputStream(nombre);
		this.objectinput = new ObjectInputStream(this.fileinput);
	}

	@Override
	public void abrirOutput(String nombre) throws IOException {
		this.fileoutput = new FileOutputStream(nombre);
		this.objectoutput = new ObjectOutputStream(this.fileoutput);
	}

	@Override
	public void cerrarInput() throws IOException {
		if(this.objectinput != null)
			this.objectinput.close();
	}

	@Override
	public void cerrarOutput() throws IOException {
		if(this.objectoutput != null)
			this.objectoutput.close();
	}

	@Override
	public void escribir(Serializable objeto) throws IOException {
		if(this.objectoutput != null)
		this.objectoutput.writeObject(objeto);
	}

	@Override
	public Serializable leer() throws IOException, ClassNotFoundException {
		Serializable o = null;
		
		if(this.objectinput != null)
			o = (Serializable) this.objectinput.readObject();
		
		return o;
	}

}
