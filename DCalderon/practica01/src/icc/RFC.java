import java.util.Scanner;
/*
*Programa que te arroja tu RFC
*objetivo:aprender sobre los metodos de la clase String como substring,indexOF etc e implementarlos a un problema. 
*@author: Diego Calderon Davila
*@version 1.0 (01/10/26)
*/
public class RFC {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		String nombreCompleto;
		String nombreUsuario;
		String fechaDeNacimiento;
		char inicialDeNombre;
		String apellidoP;
		String apellidoM;
		String inicialP;
		char inicialM;
		String anioN;
		String mesN;
		String diaN;
		System.out.println("Bienvenido, para darte tu RFC necesito tu nombre completo(omite tu segundo nombre),¿Cuál es tu nombre completo?");
		nombreUsuario = in.nextLine();
		System.out.println("Ahora necesito tu fecha de nacimiento en un formato DD/MM/AA,¿Cuál es tu fecha de nacimiento?");
		fechaDeNacimiento = in.nextLine();
		nombreCompleto= nombreUsuario.toUpperCase();
		inicialDeNombre = nombreCompleto.charAt(0);
		int posicion = nombreCompleto.indexOf(" ");
		String pruebaP = nombreCompleto.substring(posicion+1);
		int sPocision = pruebaP.indexOf(" ");
		apellidoP = pruebaP.substring(0,sPocision);
		apellidoM = pruebaP.substring(sPocision+1);
		diaN = fechaDeNacimiento.substring(0,2);
		int pocisionDia = fechaDeNacimiento.indexOf("/");
		String pruebaM = fechaDeNacimiento.substring(pocisionDia+1);
		int pocisionMes = pruebaM.indexOf("/"); 
		mesN = pruebaM.substring(0,pocisionMes);
		anioN = pruebaM.substring(pocisionMes+1);
		inicialP = apellidoP.substring(0,2);
		inicialM = apellidoM.charAt(0);
		System.out.println("el rfc de "+nombreUsuario+" es:"+inicialP+inicialM+inicialDeNombre+anioN+mesN+diaN);
	}
}
