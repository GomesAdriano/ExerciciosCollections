package br.edu.ufam.algoritmo;

import java.util.Stack;

// @author Adriano Gomes

public class Pilha {
	
	private Stack<String> pilha = new Stack<String>();
	
	//retorna a pilha
	public Stack<String> getPilha() {
		return pilha;
	}
	
	//verifica se a pilha esta vazia
	public boolean pilhaVazia() {
		if(getPilha().isEmpty()) {
			System.out.println("Não há jogos!");
			return false;
		}else{
			return true;
		}
	}
	
	//verifica o tamanho da pilha
	public void tamanhoPilha() {
		
		//verifica se há elementos na pilha
		if(!pilhaVazia()) {
			return;
		}
		
		System.out.println("Tamanho da pilha: " + getPilha().size());
	}
	
	//empilha jogos
	public void adicionarPilha(String jogo) {
		getPilha().push(jogo);
	}
	
	//desempilha jogos
	public void removerPilha() {
		
		//verifica se há elementos na pilha
		if(!pilhaVazia()) {
			return;
		}
		
		getPilha().pop();
	}
	
	//exibe toda a pilha
	public void exibirPilha() {
		
		//verifica se há elementos na pilha
		if(!pilhaVazia()) {
			return;
		}
		
		System.out.println("Pilha: " + getPilha());
	}
	
	//exibe o topo da pilha
	public void primeiroPilha() {
		
		//verifica se há elementos na pilha
		if(!pilhaVazia()) {
			return;
		}
		
		System.out.println("Topo da pilha: " + getPilha().peek());
	}
	
	//exibe o ultimo da pilha
	public void ultimoPilha() {
		
		//verifica se há elementos na pilha
		if(!pilhaVazia()) {
			return;
		}
		
		System.out.println("Último da pilha: " + getPilha().get(0));
	}
	
	//pesquisar na pilha
	public void pesquisarPilha(String jogo) {
		
		//verifica se há elementos na pilha
		if(!pilhaVazia()) {
			return;
		}
		
		//se contem o jogo
		if(getPilha().contains(jogo)) {			
			System.out.println(jogo + " está na pilha!");
		//senao contem o jogo
		}else {
			System.out.println(jogo + " não está na pilha!");
		}		
	}	
}
