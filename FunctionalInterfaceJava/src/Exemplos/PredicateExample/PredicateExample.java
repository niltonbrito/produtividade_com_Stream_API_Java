package Exemplos.PredicateExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T <T> e retorna um
 * valor booleano (Verdadeiro ou Falso). É comumente usada para filtrar os
 * elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
	public static void main(String[] args) {
		// Criar uma lista de palavras
		List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");

		// Criar um predicate que verifica se a palavra tem mais de 5 caracteres
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

		// Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em
		// seguida,
		// imprimir cada palavra que passou no filtro
		palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
	}
}
