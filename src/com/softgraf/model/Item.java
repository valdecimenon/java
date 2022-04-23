package com.softgraf.model;

public class Item {

	// numero - inteiro
	// qtdeProduto - inteiro
	// produto

	private int numero;
	private int qtdeProduto;
	private Produto produto;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQtdeProduto() {
		return qtdeProduto;
	}

	public void setQtdeProduto(int qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
