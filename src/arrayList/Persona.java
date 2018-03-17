package arrayList;

public class Persona {

	private String nombre;

	private int edad;

	private String apellidos;

	private String dni;

	
	Direccion d;

	
	public Persona() {// constructor de la clase vacio

	}

	public Persona(String nombre, String apellidos, String dni,int edad,String calle, int numero,int cp, String Provincia ) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.apellidos = apellidos;
		this.dni = dni;
		d = new Direccion(calle,numero,cp, Provincia);
		
	}

	public String getNombre() {

		return nombre;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public int getEdad() {

		return edad;

	}

	public void setEdad(int edad) {

		this.edad = edad;

	}

	public String getApellidos() {
		
		return apellidos;
	}

	public void setApellidos(String apellidos) {

		this.apellidos = apellidos;

	}

	public String getDni() {

		return dni;

	}

	public void setDni(String dni) {

		this.dni = dni;

	}

	public String toString() {
		
		return nombre+apellidos+dni+edad+d;
		
	}

	/**
	 * @return the d
	 */
	public Direccion getD() {
		return d;
	}

	/**
	 * @param d the d to set
	 */
	public void setD(Direccion d) {
		this.d = d;
	}

}
// }
