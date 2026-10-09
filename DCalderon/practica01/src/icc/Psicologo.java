import  java.util.Scanner;
/*
* Piscologo.java
* programa que simula una seción con un psicologo 
* objetivo:fortalecer el uso del System.out y System.in.,
* @Author:Diego Calderon Davila
* @version:1
*/
public class Psicologo{
	public static void main ( String [] args ){
		Scanner in = new Scanner (System.in);
		String paciente;
		String problema;
		String problemaCitado;
		String respuestaProblema;
		System.out.println("Bienvenido al 'psicologo',¿cuál es tu nombre?");
		paciente = in.nextLine();
		System.out.println("Hola "+paciente+" ¿cuál es tu problema?");
		problema = in.nextLine();
		problemaCitado = "\"" +problema+ "\"";
		System.out.println("MMMM.... ya veo..");
		System.out.println("y digame ...");
		System.out.println("¿Por qué dice que "+problemaCitado+"?");
		respuestaProblema = in.nextLine();
		System.out.println("Muy interesante!! Hablaremos de ello con más detalle en la sesión.");
        }
}
