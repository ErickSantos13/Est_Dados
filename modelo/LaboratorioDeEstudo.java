package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

import unitins.ArrayTins;

class PlantaPredio{
	String endereco = "sim";
	String cor;
}


public class LaboratorioDeEstudo {

	/*public static void main(String[] args) {		
//		new PlantaPredio();
//		new PlantaPredio();
//		new PlantaPredio();
//		
//
//		PlantaPredio predio1 = new PlantaPredio();
//		PlantaPredio predio2 = predio1;
//
//		predio1 = null;
//		
//		System.out.println("Prédio 1: "+predio1+"\nPrédio 2: "+predio2+"");
		ArrayList<PlantaPredio> listaJava = new ArrayList<PlantaPredio>();
		//LinkedList<PlantaPredio> lista2 = new LinkedList<PlantaPredio>();
		
		ArrayTins<PlantaPredio> listaTins = new ArrayTins<PlantaPredio>();
		
		System.out.println(listaJava.isEmpty());
		System.out.println(listaTins.isEmpty());
		
		System.out.println(listaJava.size());
		System.out.println(listaJava.size());
		
		listaJava.add(new PlantaPredio());
		listaJava.add(new PlantaPredio());
		
		listaTins.add(new PlantaPredio());
		listaTins.add(new PlantaPredio());
		
		
		System.out.println(listaJava.isEmpty());
		System.out.println(listaTins.isEmpty());
		
		System.out.println(listaJava.size());
		System.out.println(listaTins.size());
		
		System.out.println(listaJava);
		System.out.println(listaTins);
		
		System.out.println(listaTins.get(0));
		System.out.println(listaTins.get(1));
		
		
	} */
	
	public static void main(String[] args) {
		
		ArrayTins<PlantaPredio> lista = new ArrayTins<PlantaPredio>();
		
		lista.add(new PlantaPredio());
		lista.add(new PlantaPredio());
		lista.add(new PlantaPredio());
		
		System.out.println(lista);
		
		lista.add2(3 ,new PlantaPredio());
		
		System.out.println(lista);

		lista.remove(2);
		
		System.out.println(lista);
		
		
	}
	

}

//COLETOR DE LIXO
//CLASSE = Modelo de um Objeto
//VARIÁVEL DE REFERÊNCIA
//OBJETO
//MEMÓRIA

