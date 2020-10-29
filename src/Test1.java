
public class Test1 {

	public static void main(String[] args) {
		Persona persona = new Persona("Vicente Matus", "20.254.311-1", 21);
		Estudiante estudiante = new Estudiante("IECI", 2019, 2018, "Vicente", "20.254.311-1", 20);

		estudiante.verificarEgreso();
		estudiante.getData();
	}

}
