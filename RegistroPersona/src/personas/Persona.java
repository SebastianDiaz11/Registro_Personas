package personas;

import java.util.Objects;

public class Persona {
 
	//Valores como el dni,nombre,apellidos y sexo de la persona registrada
	public String dni,nombre,apellido,sexo;
	//Se declara y almacena el valor de la edad de la persona
	public int edad;
	//Se almacena el peso de la persona
	public double peso;
	
	
	public Persona (String dni, String nombre, String apellido, String sexo, int edad, double peso) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}
	public Persona (String dni) {
		
		this.dni = dni;
	}
	
	//Metodo GETTER Y SETTER
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//ESTE ES EL METODO TOSTRING NOS IMPRIME POR CONSOLA EL VALOR
	public String toString() {
		return "PERSONA [DNI= " + dni + ", Nombre= " + nombre + ", Apellido= " + apellido + ", Sexo= " + sexo + ", Edad= "
				+ edad + ", Peso= " + peso + "]";
	}
	//Compara si un dni es igual o no
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + Objects.hashCode(this.dni);
		return hash;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
	}
		if (obj == null) {
			return false;
	}
		if (getClass() != obj.getClass()) {
			return false;
	}		
		final Persona other = (Persona) obj;
		return Objects.equals(this.dni, other.dni); 
	}
	
	
}
