package personas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ProyectoListaPersona {

	ArrayList<Persona> listaPersonas;

	public static void main(String[] args) {

		//Declaro una variable de tipo entero llamada opcion.
		int opcion;
		
		ProyectoListaPersona proyectoPersonas = new ProyectoListaPersona();
		
		proyectoPersonas.listaPersonas = new ArrayList();
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Menu lista de personas");
			System.out.println("1. Registrar Persona");
			System.out.println("2. Buscar persona por DNI");
			System.out.println("3. Eliminar persona");
			System.out.println("4. Ordenar por apellido");
			System.out.println("5. Mostrar lista de persona");
			System.out.println("6. Salr del sistema");
			System.out.print("Introduzca un numero:");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				proyectoPersonas.registrarPersona();
				break;
			case 2:
				proyectoPersonas.buscarPersona();
				break;
			case 3:
				proyectoPersonas.eliminarPersona();
				break;
			case 4:
				proyectoPersonas.ordenarPorApellido();
				break;
			case 5:
				proyectoPersonas.mostrarPersona();
				break;
			}
		}while (opcion != 6);
			System.out.println("Saliste del programa");
	}
	public void registrarPersona() {
		String dni,apellido,nombre,sexo;
		int edad;
		double peso;
		Scanner entrada = new Scanner(System.in);
		System.out.println("DNI:");
		dni = entrada.next();
		System.out.println("Nombre:");
		nombre = entrada.next();
		System.out.println("Apellido:");
		apellido = entrada.next();
		System.out.println("Sexo:");
		sexo = entrada.next();
		System.out.println("Edad:");
		edad = entrada.nextInt();
		System.out.println("Peso:");
		peso = entrada.nextDouble();
		
		Persona persona = new Persona(dni,nombre,apellido,sexo,edad,peso);
		
		listaPersonas.add(persona);
	}
	public void buscarPersona() {
		String dni;
		int indice;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca DNI a buscar: ");
		dni = entrada.next();
		
		Persona persona = new Persona(dni);
		
		indice = listaPersonas.indexOf(persona);
		
		if(indice != 1) {
			persona = listaPersonas.get(indice);
			System.out.println(persona);
		}else {
			System.out.println("La persona no se encuentra");
		}
	}
	public void eliminarPersona () {
		String dni;
		
		int indice;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el DNI a eliminar: ");
		dni = entrada.next();
		
		Persona persona = new Persona(dni);
		
		indice = listaPersonas.indexOf(persona);
		
		if(indice != 1) {
			
			persona = listaPersonas.remove(indice);
			
			System.out.println("Persona eliminada del registro: "+persona);
		} else {
			System.out.println("La persona no se encuentra registrada.");
		}
	}
	public void mostrarPersona() {
		
		if(listaPersonas.size()>0) {
			for (Persona persona : listaPersonas) {
				System.out.println(persona);
			}
		} else {
			System.out.println("No se encuentran personas registradas.");
		}	
	}
	public void ordenarPorApellido() {
		
		Collections.sort(listaPersonas, (Persona persona1, Persona persona2)
		-> persona1.getApellido().compareTo(persona2.getApellido()));
		mostrarPersona();
	}
}
