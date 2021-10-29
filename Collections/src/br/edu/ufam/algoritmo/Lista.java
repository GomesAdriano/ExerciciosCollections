package br.edu.ufam.algoritmo;

import java.util.ArrayList;
import java.util.Collection;

// @author Adriano Gomes

public class Lista {
	
	private Collection<Integer> lista = new ArrayList<>();
	
	//retorna a lista
	public Collection<Integer> getLista() {
		return lista;
	}
	
	//verifica se a lista esta vazia
	public boolean listaVazia() {
		if(getLista().isEmpty()) {
			System.out.println("Não têm valores na lista!");
			return false;
		}else{
			return true;
		}
	}
	
	//verifica o tamanho da lista
	public void tamanhoLista() {
		
		//verifica se há elementos na lista
		if(!listaVazia()) {
			return;
		}
		
		System.out.println("Tamanho da lista: " + getLista().size());
	}
	
	//adiciona numeros a lista
	public void adicionarLista(int numero) {
		getLista().add(numero);
	}
	
	//remove numeros da lista
	public void removerLista(int numero) {
		
		//verifica se há elementos na lista
		if(!listaVazia()) {
			return;
		}
		
		//se contem o numero
		if(getLista().contains(numero)) {			
			getLista().remove(numero);
		//senao contem o numero
		}else {
			System.out.println(numero + " não está na lista!");
		}
		
		getLista().remove(numero);
	}
	
	//deleta toda a lista
	public void deletarTodaLista() {
		
		//verifica se há elementos na lista
		if(!listaVazia()) {
			return;
		}
		
		getLista().clear();
	}
	
	//exibe toda a lista
	public void exibirLista() {
		
		//verifica se há elementos na lista
		if(!listaVazia()) {
			return;
		}
		
		System.out.println("Lista: " + getLista());
	}
	
	//exibe o primeiro numero da lista
	public void primeiroLista() {
		
		//verifica se há elementos na lista
		if(!listaVazia()) {
			return;
		}
		
		System.out.println("Primeiro da lista: " + getLista().toArray()[0]);
	}
	
	//exibe o ultimo numero da lista
	public void ultimoLista() {
		
		//verifica se há elementos na lista
		if(!listaVazia()) {
			return;
		}
		
		System.out.println("Último da fila: " + getLista().toArray()[getLista().size()-1]);
	}
	
	//pesquisar na lista
	public void pesquisarLista(int numero) {
		
		//verifica se há elementos na lista
		if(!listaVazia()) {
			return;
		}
		
		//se contem o numero
		if(getLista().contains(numero)) {			
			System.out.println(numero + " está na lista!");
		//senao contem o numero
		}else {
			System.out.println(numero + " não está na lista!");
		}		
	}	
}
