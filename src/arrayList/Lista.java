package arrayList;

import java.util.*;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class Lista{
	
	public static ArrayList<Persona> personas;
	
	public Lista() {
		
	
	
	personas=new ArrayList<Persona>();
	}
	
	public static void cargar() {
	Persona p = new Persona("Adrian","Garcia Santos","1111111A",23,"C/Los Olivos",3,38493,"SC Tfe");
	Persona p1 = new Persona("Ana","Mendez Nuñez","2222222B",22,"C/Los Pinos",25,38403,"SC Tfe");
	Persona p2 = new Persona("Maria","Sanchez Camacho","3333333C",45,"C/Los Franceses",23,38505,"Las Palmas");
	Persona p3 = new Persona("Julio","Brito Gonzalez","4444444D",30,"C/Los Pinos",25,38403,"SC Tfe");
	
	
	personas.add(p);
	personas.add(p1);
	personas.add(p2);
	personas.add(p3);
	
	}
	
	
			
	public static void listar() {
		
		for (Persona a: personas) {
			System.out.println("Nombre "+ "Apellidos "+  "DNI "+ "Edad "+"Calle "+"Numero "+"CP "+
		"Provincia");
			System.out.println(a);
			
		}
		
		
	}
	
	public static void insertar(Persona p) {
		personas.add(p);

			

		
	}
	
	public static void eliminar (Persona p) {
		
		personas.remove(p);
	}
	
	public static void contar() {
		personas.size();
	}
}
