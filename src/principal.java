import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class principal {
	public static void main(String[] args) {
		nombre();
		//
		mayor10(90);
		//
		int ale = aleatorio();
		JOptionPane.showMessageDialog(null, ale);
		//
		int[] array= {1,2,3,4,5,6,7};
		int valorMaximo=arrayMayor(array);
		JOptionPane.showMessageDialog(null, valorMaximo);
		//
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(4);
		lista.add(3);
		lista.add(22);
		lista.add(122);
		lista.add(1222);
		
		int valorMaximo1=arrayListMayor(lista);
		JOptionPane.showMessageDialog(null, valorMaximo1);
		//
		
		int[] arreglo1= {1,2,3,4,5};
		int[] arreglo2= {1,2,3,4,5};
		
		int[] suma = sumaArrarys(arreglo1, arreglo2);
		
		for (int total : suma) {
			JOptionPane.showMessageDialog(null, total);
		}
		
		//
		palabras palabra = new palabras();
	}
	
	/*1. Realice un algoritmo que use un método sin parámetros y sin retorno que imprime en pantalla tu nombre completo int */
	public static void nombre() {
		JOptionPane.showMessageDialog(null, "Angel Stiven Velez castaño");
	}
	
	/*2. Realice un algoritmo que use un Método con parámetros y sin retorno que recibe un número entero y lo imprime en pantalla si es mayor que 10*/
	public static void mayor10(double num1) {
		if (num1>10) {
			JOptionPane.showMessageDialog(null, num1);
		} else {
			JOptionPane.showMessageDialog(null, "es menor a 10");
		}
	}
	
	/*3. Realice un algoritmo que use un Método sin parámetros y con retorno que genera un número aleatorio entre 1 y 100 y lo devuelve como resultado*/
	public static int aleatorio() {
		int aleatorio=0;
		
		aleatorio = (int) (Math.random() *100);
		
		return aleatorio;
		
	}
	
	/*4. Realice un algoritmo que use un Método con parámetros y con retorno que recibe un arreglo de enteros y devuelve el valor máximo del arreglo*/
	public static int arrayMayor(int[] arreglo) {
		int valorMaximo=arreglo[0];
		
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i]>valorMaximo) {
				valorMaximo=arreglo[i];
			}
		}
		return valorMaximo;
	}
	
	/*5. Realice un algoritmo que use un Método con parámetros y con retorno que recibe un ArrayList de enteros y devuelve el valor máximo de la lista*/
	public static int arrayListMayor(ArrayList<Integer> lista) {
		if (lista.isEmpty()) {
			throw new IllegalArgumentException("Lista vacia");
		}
		int valorMaximo=lista.get(0);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i)>valorMaximo) {
				valorMaximo=lista.get(i);
			}
		}
		return valorMaximo;
	}
	
	/*6. Realice un algoritmo que use un Método con parámetros y con retorno que recibe dos arreglos de enteros del mismo tamaño y devuelve un nuevo arreglo que contiene la suma de los elementos de ambos arreglos*/
	public static int[] sumaArrarys(int[] arreglo1, int[] arreglo2) {
		if (arreglo1.length != arreglo2.length) {
			throw new IllegalArgumentException("Error: arreglos con tamaño diferente");
		}
		int[] suma = new int [arreglo1.length];
		
		for (int i = 0; i < arreglo1.length; i++) {
			suma[i]=arreglo1[i]+arreglo2[i];
		}
		return suma;
	}
	
	
	
}

















