package edu.upc.eetac.dsa.ejerciciosobjetos;

public class Arbol {

	int altura;
	String nombre;

	Arbol(int a) {
		altura = a;
		System.out.println("Un �rbol de " + altura + " metros");
	}

	Arbol(String n) {
		nombre = n;
		System.out.println("Un " + nombre);
	}

	Arbol() {
		System.out.println("Un �rbol gen�rico");
	}

	Arbol(int a, String n) {
		altura = a;
		nombre = n;

		System.out.println("Un " + nombre + " de " + altura + " metros");
	}
}
