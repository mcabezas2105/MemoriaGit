package gitPractica;

public class ClaseC {
    String nombre;
    String apellido;
    int edad;
	public ClaseC(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "ClaseC [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	public void ingresarNombre() {
		Scanner teclado=new Scanner (System.in);
		String nombre;
		nombre=teclado.nextLine();
	}
	public void añadirEdad(){
		Scanner teclado=new Scanner(System.in);
		int edad;
		edad=teclado.nextLine();
	}
	public void verDatos(){
	}
	
	
	
	
	
	
    
}
