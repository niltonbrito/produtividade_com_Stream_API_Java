package Exemplos.FunctionExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T <T> e retorna um
 * resultado do tipo R É utilizada para transformar ou mapear os elementos dos
 * Stream em outros valores ou tipos
 */

public class FunctionExample {
	public static void main(String[] args) {
		// Criar uma lista de numeros inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		// Usar a function com expressão lambda para dobrar todos os numeros
		Function<Integer, Integer> dobrar = numero -> numero * 2;

		// Usar a função para dobrar todos os numeros no Stream e armazená-los em outra
		// lista
		List<Integer> numerosDobrados = numeros.stream().map(numero -> numero * 2).toList();

		// Imprimir a lista de números dobrados
		numerosDobrados.forEach(System.out::println);
	}
}
