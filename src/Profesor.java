
public class Profesor extends Persona {

	String gradoAcademico, universidad;

	public Profesor(String gradoAcademico, String universidad, String nombre, String rut, int edad) {
		super(nombre, rut, edad);
		this.gradoAcademico = gradoAcademico;
		this.universidad = universidad;
	}

	public void setGradoAcademico(String gradoAcademico) {
		System.out.println("[ACTUALIZACION] Cambiado el Grado Academico a " + gradoAcademico);
		this.gradoAcademico = gradoAcademico;
	}

	public void getData() {
		System.out.println("***PROFESOR*** ");
		System.out.println("Nombre: " + nombre);
		System.out.println("RUT:" + rut);
		System.out.println("Edad: " + edad);
		System.out.println("Grado Academico: " + gradoAcademico);
		System.out.println("Universidad: " + universidad);
	}

}
