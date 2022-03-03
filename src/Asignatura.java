
public class Asignatura {
	String nombre;
	int codigo, horas;
	/**
	 * Constructor por defecto
	 */
	public Asignatura() {
		
	}
	/**
	 * Constructor parametrizado con todos los atributos
	 * @param nombre: contiene el nombre de la asignatura
	 * @param codigo: contiene el código de la asignatura
	 * @param horas: contiene el nº de horas de la asignatura
	 */
	public Asignatura(String nombre, int codigo, int horas) {
		this.nombre= nombre;
		this.codigo= codigo;
		this.horas= horas;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setNombre(String name) {
		this.nombre= name;
	}
	
	/**
	 * 
	 * @param cod
	 */
	public void setCodigo(int cod) {
		this.codigo= cod;
	}
	
	/**
	 * 
	 * @param hours
	 */
	public void setHoras(int hours) {
		this.horas= hours;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getHoras() {
		return horas;
	}
	
	public void mostrar() {
		System.out.printf("La asignatura se llama %s, su código es %d, tiene %d horas\n",nombre, codigo, horas);
	}
	
}
