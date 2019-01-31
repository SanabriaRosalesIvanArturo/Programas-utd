package programas_u1_poo;

public class Persona {
	private String nombre;
	private Byte edad;
	private float estatura;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Byte getEdad() {
		return edad;
	}
	public void setEdad(Byte edad) {
		this.edad = edad;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}
}
	