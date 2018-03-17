package arrayList;

import java.util.*;

public class MainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opcion;
		do {
			
						
			System.out.println("Elige la opcion que desee:");
			System.out.println("1. opcion cargar datos");
			System.out.println("2. opcion listar datos");
			System.out.println("3. opcion insertar un dato al final de la lista");
			System.out.println("4. opcion elimine un dato indicando su posicion");
			System.out.println("5. opcion indica el numero de datos");
			System.out.println("0. Salir");
			
			opcion=sc.nextInt();
			switch (opcion){
			
			case 1:
				Lista.cargar();
			break;
			
			case 2:
				Lista.listar();
			break;
			
			case 3:
				Lista.insertar(p);
			break;	
			
			case 4:
				Lista.eliminar(p);
			break;
			
			case 5:
				Lista.contar();
			break;
			
			default:
				System.out.println("bye");
			break;
		
		}
		
		}
		while (opcion!=0);
		
		
		
		//me falta algo para insertar las personas y eliminarlas
		
	

}
}