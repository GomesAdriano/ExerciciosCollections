package br.edu.ufam.app;

import br.edu.ufam.algoritmo.Fila;
import br.edu.ufam.algoritmo.Lista;
import br.edu.ufam.algoritmo.Pilha;

//@author Adriano Gomes

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		testeFila();
		testeLista();
		testePilha();

	}
	
	public static void testeFila() {
		Fila fila = new Fila();
		System.out.println("----------Fila----------");
		System.out.println("Pessoas na fila");
		fila.adicionarFila("Adriano");
		fila.exibirFila();
		fila.adicionarFila("Paulo");
		fila.exibirFila();
		fila.adicionarFila("Rafael");
		fila.exibirFila();
		fila.adicionarFila("Taynara");
		fila.exibirFila();
		fila.adicionarFila("Nicole");
		fila.exibirFila();
		
		System.out.println("\n");
		
		fila.tamanhoFila();
		
		System.out.println("\n");
		
		fila.primeiroFila();
		fila.ultimoFila();
		
		System.out.println("\n");
		
		fila.pesquisarFila("Rafael");
		fila.pesquisarFila("Victor");
		
		System.out.println("\n");
		
		System.out.println("Pessoas na fila");
		fila.exibirFila();
		fila.removerFila();
		fila.exibirFila();
		fila.removerFila();
		fila.exibirFila();
		fila.removerFila();
		fila.exibirFila();
		fila.removerFila();
		fila.exibirFila();
		fila.removerFila();
		fila.exibirFila();
	}
	
	public static void testePilha() {
		System.out.println("\n\n----------Pilha----------");
		Pilha pilha = new Pilha();
		System.out.println("Pilha de jogos");
		pilha.adicionarPilha("Black");
		pilha.exibirPilha();
		pilha.adicionarPilha("Alien Isolation");
		pilha.exibirPilha();
		pilha.adicionarPilha("Medal of Honor");
		pilha.exibirPilha();
		pilha.adicionarPilha("Battlefield");
		pilha.exibirPilha();
		pilha.adicionarPilha("Call of Duty");
		pilha.exibirPilha();
		
		System.out.println("\n");
		
		pilha.tamanhoPilha();
		
		System.out.println("\n");
		
		pilha.primeiroPilha();
		pilha.ultimoPilha();
		
		System.out.println("\n");
		
		pilha.pesquisarPilha("Battlefield");
		pilha.pesquisarPilha("Donkey Kong");
		
		System.out.println("\n");
		
		System.out.println("Pilha de jogos");
		pilha.exibirPilha();
		pilha.removerPilha();
		pilha.exibirPilha();
		pilha.removerPilha();
		pilha.exibirPilha();
		pilha.removerPilha();
		pilha.exibirPilha();
		pilha.removerPilha();
		pilha.exibirPilha();
		pilha.removerPilha();
		pilha.exibirPilha();
	}

	public static void testeLista() {
		System.out.println("\n\n----------Lista----------");
		Lista lista = new Lista();
		System.out.println("Números da Sorte");
		lista.adicionarLista(22);
		lista.exibirLista();
		lista.adicionarLista(42);
		lista.exibirLista();
		lista.adicionarLista(8);
		lista.exibirLista();
		lista.adicionarLista(24);
		lista.exibirLista();
		lista.adicionarLista(1);
		lista.exibirLista();
		
		System.out.println("\n");
		
		lista.tamanhoLista();
		
		System.out.println("\n");
		
		lista.primeiroLista();
		lista.ultimoLista();
		
		System.out.println("\n");
		
		lista.pesquisarLista(8);
		lista.pesquisarLista(5);
		
		System.out.println("\n");
		
		System.out.println("Números da Sorte");
		lista.exibirLista();
		lista.removerLista(1);
		lista.exibirLista();
		lista.removerLista(42);
		lista.exibirLista();
		lista.removerLista(3);
		lista.exibirLista();
		
		System.out.println("\n");
		
		lista.deletarTodaLista();
		lista.exibirLista();
	}
}
