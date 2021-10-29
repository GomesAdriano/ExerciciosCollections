package br.edu.ufam.algoritmo;

import java.util.LinkedList;
import java.util.Queue;

// @author Adriano Gomes

public class Fila {
	
	private Queue<String> fila = new LinkedList<String>();
	
	//retorna a fila
	public Queue<String> getFila() {
		return fila;
	}
	
	//verifica se a fila esta vazia
	public boolean filaVazia() {
		if(getFila().isEmpty()) {
			System.out.println("Não têm ninguem na fila!");
			return false;
		}else{
			return true;
		}
	}
	
	//verifica o tamanho da fila
	public void tamanhoFila() {
		
		//verifica se há elementos na fila
		if(!filaVazia()) {
			return;
		}
		
		System.out.println("Tamanho da fila: " + getFila().size());
	}
	
	//adiciona pessoas a fila
	public void adicionarFila(String nome) {
		getFila().add(nome);
	}
	
	//remove pessoas da fila
	public void removerFila() {
		
		//verifica se há elementos na fila
		if(!filaVazia()) {
			return;
		}
		
		getFila().poll();
	}
	
	//exibe toda a fila
	public void exibirFila() {
		
		//verifica se há elementos na fila
		if(!filaVazia()) {
			return;
		}
		
		System.out.println("Fila: " + getFila());
	}
	
	//exibe o primeiro da fila
	public void primeiroFila() {
		
		//verifica se há elementos na fila
		if(!filaVazia()) {
			return;
		}
		
		System.out.println("Primeiro da fila: " + getFila().peek());
	}
	
	//exibe o ultimo da fila
	public void ultimoFila() {
		
		//verifica se há elementos na fila
		if(!filaVazia()) {
			return;
		}
		
		System.out.println("Último da fila: " + getFila().toArray()[getFila().size()-1]);
	}
	
	//pesquisar na fila
	public void pesquisarFila(String nome) {
		
		//verifica se há elementos na fila
		if(!filaVazia()) {
			return;
		}
		
		//se contem o nome
		if(getFila().contains(nome)) {			
			System.out.println(nome + " está na fila!");
		//senao contem o nome
		}else {
			System.out.println(nome + " não está na fila!");
		}		
	}	
}
