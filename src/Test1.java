
public class Test1 {

	public static void main(String[] args) {

		// Caso Incorrecto
//		Estudiante estudiante = new Estudiante("IECI", 2022, 2010, "Vicente Matus Ortiz", "20.254.311-1", 21);

		// Caso Correcto
		Estudiante estudiante = new Estudiante("IECI", 2010, 2022, "Vicente Matus Ortiz", "20.254.311-1", 21);
		estudiante.setYearEgreso(2024);
		estudiante.getData();
		System.out.println();

		Auxiliar auxiliar = new Auxiliar("Departamento Gantes", "3245", "Juanito", "10.999.348-3", 30);
		auxiliar.setFacultad("Ciencias Empresariales");
		auxiliar.getData();
		System.out.println();

		Profesor profesor = new Profesor("Doctorado", "UBB", "Felipe Torres", "15.345.349-8", 40);
		profesor.setGradoAcademico("Licenciado");
		profesor.getData();

		System.out.println();

	}

}
