package arrayList;

import java.util.*;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class Lista{
	
	public static ArrayList<Persona> personas=new ArrayList<Persona>();;
	
	public Lista() {
		
		
	}
	
	public static void cargar() {
	personas.add(new Persona("Adrian ","Garcia Santos ","1111111A ",23 ,"    C/Los Olivos ",3 ,  38493 ,"   SC Tfe "));
	personas.add(new Persona("Ana ","Mendez Nuñez ","2222222B ",22 ,"    C/Los Pinos ",25 ,  38403 ,"   SC Tfe "));
	personas.add(new Persona("Maria ","Sanchez Camacho ","3333333C ",45 ,"    C/Los Franceses ",23 ,  38505 ,"   Las Palmas "));
	personas.add( new Persona("Julio ","Brito Gonzalez ","4444444D ",30 ,"    C/Los Pinos ",25 ,  38403 ,"   SC Tfe "));
	
	
	
	
	}
	
	
			
	public static void listar() {
		
		for (Persona a: personas) {
			System.out.println("Nombre  "+ "Apellidos    "+  "  DNI    "+ "Edad "+"Calle       "+"   Numero "+"    "
					+ "CP   "+
		"Provincia");
			System.out.println(a);
			
		}
		
		
	}
	
	public static void insertar(Persona c) {
		personas.add(c);

			

		
	}
	
	public static void eliminar (int p) {
		
		personas.remove(p);
	}
	
	public static void contar() {
		System.out.println("Existen "+personas.size() + " persnas");
	}
}
