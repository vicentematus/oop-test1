import java.util.Scanner;

public class Estudiante extends Persona {

	String carrera;
	int yearIngreso;
	int yearEgreso;
	Scanner sc = new Scanner(System.in);

	public Estudiante(String carrera, int yearIngreso, int yearEgreso, String nombre, String rut, int edad) {
		super(nombre, rut, edad);
		this.carrera = carrera;
		this.yearIngreso = yearIngreso;
		this.yearEgreso = yearEgreso;
		verificarEgreso();

	}

	public void verificarEgreso() {

		int yearEgresoAux;
		if (yearEgreso < yearIngreso) {

			System.out.println("[ERROR] Anio de Egreso es menor al de Ingreso");
			System.out.println("Tiene que ser mayor a " + yearIngreso + "\nIngrese nuevamente el valor:");

			boolean validacion = false;
			yearEgresoAux = sc.nextInt();
			while (!validacion) {

				if (yearEgresoAux < yearIngreso) {
					System.out.println("[ERROR] Anio de Egreso es menor a mayor");
					System.out.println("Tiene que ser mayor a " + yearIngreso + "\nIngrese nuevamente el valor.:");
					yearEgresoAux = sc.nextInt();
				} else if (yearIngreso == yearEgresoAux) {
					System.out.println("No pueden graduarse el mismo anio. \nIngrese un anio mayor a " + yearIngreso);
					yearEgresoAux = sc.nextInt();
				} else {
					System.out.println("[CORRECTO] Modificado con exito.");
					validacion = true;
				}
			}
			this.yearEgreso = yearEgresoAux;
		}
	}

	public void setYearEgreso(int yearEgreso) {
		if (yearEgreso > this.yearEgreso) {
			System.out.println("Cambiado con exito de " + this.yearEgreso + ">>>> " + yearEgreso);
			this.yearEgreso = yearEgreso;
		} else {
			System.out.println("[ERROR] El year ingresado tiene que ser mayor al actual que es " + this.yearEgreso);

			while (true) {
				System.out.println("Ingrese nuevamente un valor");
				yearEgreso = sc.nextInt();

				if (yearEgreso > this.yearEgreso) {
					System.out.println("Cambiado con exito de " + this.yearEgreso + ">>>> " + yearEgreso);
					this.yearEgreso = yearEgreso;
					break;
				}

				else if (yearEgreso == this.yearEgreso) {
					System.out
							.println("No pueden graduarse el mismo anio. \nIngrese un anio mayor a " + this.yearEgreso);

				} else {
					System.out.println(
							"[ERROR] El year ingresado tiene que ser mayor al actual que es " + this.yearEgreso);

				}
			}

		}

	}

	public void getData() {
		System.out.println("***INFORMACION ESTUDIANTE*** ");
		System.out.println("Nombre: " + nombre);
		System.out.println("RUT:" + rut);
		System.out.println("Edad: " + edad);
		System.out.println("Carrera: " + carrera);
		System.out.println("Anio de Ingreso: " + yearIngreso);
		System.out.println("Anio de Egreso: " + yearEgreso);
	}
}
