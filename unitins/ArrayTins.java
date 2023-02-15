package unitins;

import java.util.Arrays;

public class ArrayTins<T> { // Estrutura Genérica
	private final int SIZE = 10;
	private T[] array = null;
	private int lastPosition = 0;

	public ArrayTins() {// construtor
//		this.array = array;
//		this.lastPosition = lastPosition;
		array = (T[]) new Object[SIZE];
	}

	public boolean isEmpty() { // Retorna se o array está vazio ou não
		return lastPosition == 0 ? true : false;
	}

	@Override
	public String toString() {// reescrevendo o nome do array
		String result = "[";
		
		for (int position = 0; position < lastPosition; position++) {
			result += array[position] + ", ";
		}
		
		result += "]";
		return result;
	}

	private void resize() { // Aumenta o tamanho do array em +10
		System.out.println("Mais Memoria...");

		T[] newArray = (T[]) new Object[array.length + SIZE];

		for (int position = 0; position < array.length; position++) {

			newArray[position] = array[position];

		}
		array = newArray;
		System.gc(); // Coleto de Lixo
	}
	
	public T get(int position) {
		
		if (position < 0 || position >= lastPosition) {
			throw new ArrayIndexOutOfBoundsException("Erro");
		}
		return array[position];
	}

	public int size() { // retorna o tamanho do array
		return lastPosition;
	}

	public void add(T newElement) {// adiciona um novo elemento

		if (lastPosition == array.length) {
			resize();
		}
		array[lastPosition] = newElement;
		lastPosition++;

	}
	
	public void add2(int position, T newElement) {// adiciona um novo elemento
		
		if(position < 0 || position > lastPosition) throw new ArrayIndexOutOfBoundsException("Erro");

		if (lastPosition == array.length) {
			resize();
		}
		
		for (int i = lastPosition; i>position; i--) {
			array[i] = array[i-1];
		}
		
		array[position] = newElement;
		lastPosition++;

	}
	
	public T remove(int position) {
		
		if(position < 0 || position >= lastPosition) throw new ArrayIndexOutOfBoundsException("Erro");
		
		System.out.println("Puta que pariu");
		
		T copy = array[position];
		
		for (int i=position; i<lastPosition-1; i++) {
			array[i] = array[i+1];
		}
		
		lastPosition--;
		
		return copy;
		
	}
}
