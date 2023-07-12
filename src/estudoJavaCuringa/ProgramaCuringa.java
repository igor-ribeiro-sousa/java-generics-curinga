package estudoJavaCuringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramaCuringa {

	public static void adicionarListaNaLista(List<? extends Number> lista, List<? super Number> destino) {
		for (Number valor : lista) {
			destino.add(valor);
		}
	}

	public static void printarLista(List<?> lista) {
		for (Object o : lista) {
			System.out.print(" " + o);
		}
	}

	public static void main(String[] args) {

		List<Integer> listaInteiro = Arrays.asList(1, 8, 3, 4, 6, 9, 7);

		List<Double> listaDouble = Arrays.asList(2.5, 5.5, 10.2);

		List<Object> listaDestino = new ArrayList<Object>();

		System.out.println("Lista Inteiro : ");
		printarLista(listaInteiro);

		System.out.println();
		System.out.println();

		System.out.println("Lista copia com os inteiros : ");
		adicionarListaNaLista(listaInteiro, listaDestino);
		printarLista(listaDestino);

		System.out.println();
		System.out.println();

		System.out.println("Lista Doubles : ");
		printarLista(listaDouble);

		System.out.println();
		System.out.println();

		System.out.println("Lista copia com os inteiros mais os doubles : ");
		adicionarListaNaLista(listaDouble, listaDestino);
		printarLista(listaDestino);

	}

}
