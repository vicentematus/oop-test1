
public class Auxiliar extends Persona {

	String facultad;
	int numeroFolio;

	public Auxiliar(String facultad, int numeroFolio, String nombre, String rut, int edad) {
		super(nombre, rut, edad);
		this.facultad = facultad;
		this.nombre = nombre;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public void getData() {
		System.out.println("***PROFESOR*** ");
		System.out.println("Nombre: " + nombre);
		System.out.println("RUT:" + rut);
		System.out.println("Edad: " + edad);
		System.out.println("Facultad: " + facultad);
		System.out.println("Numero Folio: " + numeroFolio);
	}

}
