/* Meu primeiro programa Java*
 
 Este programa mostra ao aluno:
  1) Que um programa Java � constru�do dentro de um projeto Java.
  2) Todo programa Java deve ter uma classe com um m�todo main.
  3) Como exibir informa��es no terminal (console) do Java.
  4) Como ler uma string do terminal (console) do Java.
 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author user
 * Data: 03/02/2020
 */
public class Principal { // Classe que cont�m o m�todo principal.
	public static void main(String[] args) { // Este � o m�todo principal.

		System.out.println("Ol� amigo!\nQual � o seu nome?"); // Uso do println

		// Ler uma string do console usando a biblioteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Exibir uma string usando printf.
		System.out.printf("Ol� %s!\n", nome);
		in.close();
	}

}
