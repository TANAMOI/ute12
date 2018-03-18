package arrayList;

import java.util.ArrayList;
import java.util.Collections;


public class Lista  {
	
	public static ArrayList<Persona> personas=new ArrayList<Persona>();
	
	
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
					+ "CP   "+"Provincia");
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
	
	
	public static void buscadni(String dni) {
	   
	   ArrayList<String> search = new ArrayList<String>();
	  
		
		for (Persona busca : personas) {
	    	
	    	search.add(busca.getDni());
	    	
		}
	        if ((search.contains(dni))) {
	        	
	        	
	        	System.out.println(personas.get(search.indexOf(dni)));
	        }
	        else {
	    	System.out.println("el dni no existe");
	    	}
	    
	   } 

	
		
		public static void ordenar() {
		 
		 Collections.sort(personas);
		 for (Persona ord: personas) {
			 System.out.println(ord);
		 }
		 
	 }
	public int compareTo (Persona personas ) {
		
		 return (personas.compareTo(personas));		 
	}
	//public static void comparar (String nom) {
	//	System.out.println(personas.compareTo(nom));
	///}
}
	


