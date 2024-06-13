package Exemplos.BinaryOperatorExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T <T> e retorna
 * um resultado do mesmo tipo T É utilizada para realizar operações de redução
 * em pares de elementos, como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {

	public static void main(String[] args) {
		// Criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		// Usar o BinaryOperator com expressão lambda para somar dois números inteiros
		BinaryOperator<Integer> somar = Integer::sum;

		// Usar o BinaryOperator para somar todos os números no Stream
		int resultado = numeros.stream().reduce(0, somar);

		// Usar o BinaryOperator para somar todos os números no Stream
		int resultados = numeros.stream().reduce(0, Integer::sum);
		
		// Imprimir o resultado da soma
		System.out.println("A soma dos números é: " + resultados);
	}

}
