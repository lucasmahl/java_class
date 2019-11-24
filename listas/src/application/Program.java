package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// criando e instanciando a lista
		List<String> list = new ArrayList<>();// arraylist � otimizada

		list.add("Maria");
		list.add("Jo�o");
		list.add("Carlos");
		list.add("Paulo");
		list.add("Ana");
		list.add("Alessandra");

		list.add(2, "Lucas");// adiciona na posi��o 2

		list.remove("Paulo");// remove por nome
		list.remove(1);// remove por posi��o

		// remove todo string x q come�ar com a letra c
		list.removeIf(x -> x.charAt(0) == 'C');// funcao lambda //predicado

		for (String x : list) {
			System.out.println(x);
		}

		// senao tiver na lista, retorna -1
		System.out.println("Index de Maria: " + list.indexOf("Maria"));

		System.out.println();

		System.out.println("Tamanho: " + list.size());

		System.out.println();

		System.out.println("Lista: " + list);

		// para pegar s� as strings que iniciam com A
		// stream aceita opera��es com express�es lambda
		List<String> result = list.stream().filter(y -> y.charAt(0) == 'A').collect(Collectors.toList());// collect pra
																											// converter
																											// o stream
																											// pra lista

		System.out.println("Result: " + result);

		// pegar o primeiro nome q come�a com A
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("Name: " + name);

	}

}
