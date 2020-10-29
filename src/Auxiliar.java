
public class Auxiliar extends Persona {

	String facultad;
	String numeroFolio;

	public Auxiliar(String facultad, String numeroFolio, String nombre, String rut, int edad) {
		super(nombre, rut, edad);
		this.facultad = facultad;
		this.numeroFolio = numeroFolio;
	}

	public void setFacultad(String facultad) {
		System.out.println("[ACTUALIZACION] Facultad cambiada a " + facultad);
		this.facultad = facultad;
	}

	public void getData() {
		System.out.println("***AUXILIAR*** ");
		System.out.println("Nombre: " + nombre);
		System.out.println("RUT:" + rut);
		System.out.println("Edad: " + edad);
		System.out.println("Facultad: " + facultad);
		System.out.println("Numero Folio: " + numeroFolio);
	}

}
