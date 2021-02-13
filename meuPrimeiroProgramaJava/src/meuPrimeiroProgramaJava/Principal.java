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
public class Principal {
	public static void main(String[] args) {

		// Salda��o e pergunta o nme.
		System.out.println("Ol� amigo!\nQual � o seu nome?"); // Uso do println

		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Salda��o para o nome lido.
		System.out.printf("Ol� %s!\n", nome);
		
		// Perguntar a Idade
		System.out.printf("%s, qual � a sua idade?", nome);
		
		// Ler idade.
		Integer idade = in.nextInt();
		
		System.out.printf("%d! Puxa! Como voc� � jovem", idade);
		
		
	}

}
